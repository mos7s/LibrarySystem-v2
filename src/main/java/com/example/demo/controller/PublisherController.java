package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.entity.Publisher;
import com.example.demo.service.PublisherService;

@RestController
@RequestMapping("/library/publisher")
@PreAuthorize("hasRole('ADMIN')")
public class PublisherController {
	@Autowired
	private PublisherService publisherService ;
	
	@GetMapping("/get-all-publishers")
	public List <Publisher> getAll() {
		return publisherService.getAll();
	}
	@GetMapping("/get-publisher-by-id")
	public Publisher getAuthorById(@RequestParam int id) {
		return publisherService.getpublisherById(id);
	}
	@PostMapping("/add-publisher")
	public Publisher addAuthor(@RequestBody Publisher publisher) {
		return publisherService.addOrUpdatepublisher(publisher);
		
	}
	@PostMapping("/update-publisher")
	public Publisher updateAuthor(@RequestBody Publisher publisher) {
		return publisherService.addOrUpdatepublisher(publisher);
	}
	@PostMapping("/delete-publisher-by-id")
		public void deleteById(@RequestParam int id) {
		publisherService.deleteById(id);
	}
	@PostMapping("/delete-all-publisher")
	public void destroy() {
		publisherService.destroy();
	}
}
