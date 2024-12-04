package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.entity.Author;
import com.example.demo.repo.authorRepo;

@Service
public class AuthorService {
	@Autowired
	private authorRepo authorRepo;
	
	public List<Author> getAll(){
		return authorRepo.findAll();
	}
	public Author getAuthorById(Integer id) {
		return authorRepo.findById(id).orElse(null);
	}
	public Author addOrUpdateAuthor(Author author) {
		return authorRepo.save(author);
	}
	public void deleteById(Integer id) {
		 authorRepo.findById(id).orElse(null);
		 authorRepo.deleteById(id);
	}
	public void destroy() {
		authorRepo.deleteAll();
	}

}
