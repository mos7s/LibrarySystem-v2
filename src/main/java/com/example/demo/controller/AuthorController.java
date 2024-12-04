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

import com.example.demo.model.entity.Author;
import com.example.demo.repo.authorRepo;
import com.example.demo.service.AuthorService;

@RestController
@RequestMapping("/library/author")
@PreAuthorize("hasRole('ADMIN')")
public class AuthorController {
	@Autowired	
	private AuthorService authorService ;	
	@GetMapping("/get-all-authors")
	public List <Author> getAll() {
		return authorService.getAll();
	}
	@GetMapping("/get-author-by-id")
	public Author getAuthorById(@RequestParam int id) {
		return authorService.getAuthorById(id);
	}
	@PostMapping("/add-author")
	public Author addAuthor(@RequestBody Author author) {
		return authorService.addOrUpdateAuthor(author);
		
	}
	@PostMapping("/update-author")
	public Author updateAuthor(@RequestBody Author author) {
		return authorService.addOrUpdateAuthor(author);
	}
	@PostMapping("/delete-author-by-id")
		public void deleteById(@RequestParam int id) {
		authorService.deleteById(id);
	}
	@PostMapping("/delete-all-authors")
	public void destroy() {
		authorService.destroy();
	}

}
