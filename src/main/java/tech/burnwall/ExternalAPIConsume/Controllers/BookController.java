package tech.burnwall.ExternalAPIConsume.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tech.burnwall.ExternalAPIConsume.Entity.Books;
import tech.burnwall.ExternalAPIConsume.Service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/{BookTitle}")
	public ResponseEntity<Books> getBooks(@PathVariable String BookTitle){
		return bookService.getBooks(BookTitle);
	}

}
