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

import com.example.demo.model.entity.Category;
import com.example.demo.service.CatgService;
@RestController
@RequestMapping("/library/category")
@PreAuthorize("hasRole('ADMIN')")
public class CatgController {
	@Autowired
	private CatgService catgService ;
	
	@GetMapping("/get-all-categories")
	public List <Category> getAll() {
		return catgService.getAll();
	}
	@GetMapping("/get-category-by-id")
	public Category getCatgById(@RequestParam int id) {
		return catgService.getCatgById(id);
	}
	@PostMapping("/add-category")
	public Category addCategory(@RequestBody Category category) {
		return catgService.addOrUpdateCatg(category);
		
	}
	@PostMapping("/update-category")	
	public Category updateCatg(@RequestBody Category category) {
		return catgService.addOrUpdateCatg(category);
	}
	@PostMapping("/delete-category-by-id")
		public void deleteById(@RequestParam int id) {
		catgService.deleteById(id);
	}
	@PostMapping("/delete-all-categories")
	public void destroy() {
		catgService.destroy();
	}
}
