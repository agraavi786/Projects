package com.bookshop.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.services.BookServices;
import com.bookshop.entity.Book;


@RestController
public class Controller {
	@Autowired
	public BookServices bookService;
	
	@GetMapping("/Books")
	public ResponseEntity<List<Book>> allBook(){
		List<Book> li= this.bookService.getBook();
		if(li.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(li);
		
		
	}
	
	@PostMapping("/Books")
	public ResponseEntity<Book> addBooks(@RequestBody Book bo) {
		Book b1=null;
		try {
		      b1= this.bookService.addBooks(bo);
		      System.out.println(bo);
		      System.out.println(b1);
		      return ResponseEntity.status(HttpStatus.CREATED).build();
		      }
		catch(Exception e) {
			e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
	}
   
	
	@DeleteMapping("/Books/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable() int id){
		
		try {
			this.bookService.delBook(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
    
    
    
    

	
	@PutMapping("Books/{id}")
		public ResponseEntity<Book> updBook(@RequestBody Book book , @PathVariable("id") int id) {
		
		try {
			this.bookService.updateBook(book, id);
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		      
		
			
	}
	
	
		
		
	
	

}
