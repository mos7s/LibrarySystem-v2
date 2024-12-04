package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.entity.Author;
import com.example.demo.model.entity.Book;
import com.example.demo.model.entity.Category;
import com.example.demo.model.entity.Publisher;
import com.example.demo.repo.bookRepo;
@Service
public class BookService {
	@Autowired
	private bookRepo bookRepo;
	@Autowired
	private AuthorService authorService ;
	@Autowired
	private CatgService catgService ;
	@Autowired
	private PublisherService publisherService ;
	
	public List <Book> getAll(){
		return bookRepo.findAll();
	}
	public Book getBookById(Integer id) {
		return bookRepo.findById(id).orElse(null);

	}
	public  Book addOrUpdateBook(Book book, int authorId,int catgId,int publisherId) {
		Author author = authorService.getAuthorById(authorId);
		book.getAuthors().add(author);
		
		Publisher publisher = publisherService.getpublisherById(publisherId);
		book.getPublishers().add(publisher);
		
		Category category = catgService.getCatgById(catgId);
	    book.getCategories().add(category);
		return bookRepo.save(book);
	}
	public void deleteById(Integer id) {
		bookRepo.findById(id).orElse(null);
		bookRepo.deleteById(id);
	}
	public void destroy() {
		bookRepo.deleteAll();
	}
}
