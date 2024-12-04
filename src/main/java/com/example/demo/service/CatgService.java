package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Category;
import com.example.demo.repo.CatgRepo;
@Service
public class CatgService {
	@Autowired
	private CatgRepo catgRepo;
	
	public List<Category> getAll(){
		return catgRepo.findAll();
	}
	public Category getCatgById(Integer id) {
		return catgRepo.findById(id).orElse(null);
	}
	public Category addOrUpdateCatg(Category category) {
		return catgRepo.save(category);
	}
	public void deleteById(Integer id) {
		catgRepo.findById(id).orElse(null);
		catgRepo.deleteById(id);
	}
	public void destroy() {
		catgRepo.deleteAll();
	}
}
