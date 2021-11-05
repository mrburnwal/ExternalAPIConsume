package tech.burnwall.ExternalAPIConsume.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import tech.burnwall.ExternalAPIConsume.Entity.Books;

@Service
public class BookService {
	
	public ResponseEntity<Books> getBooks(String keyword) {
		String uri = "https://www.googleapis.com/books/v1/volumes?q="+keyword;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Books> tr = restTemplate.getForEntity(uri, Books.class);
		return tr;
	}
}
