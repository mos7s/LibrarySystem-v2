package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.entity.Publisher;
import com.example.demo.repo.PublisherRepo;
@Service
public class PublisherService {
	@Autowired
	private PublisherRepo publisherRepo;
	
	public List<Publisher> getAll(){
		return publisherRepo.findAll();
	}
	public Publisher getpublisherById(Integer id) {
		return publisherRepo.findById(id).orElse(null);
	}
	public Publisher addOrUpdatepublisher(Publisher publisher) {
		return publisherRepo.save(publisher);
	}
	public void deleteById(Integer id) {
		publisherRepo.findById(id).orElse(null);
		publisherRepo.deleteById(id);
	}
	public void destroy() {
		publisherRepo.deleteAll();
}
}
