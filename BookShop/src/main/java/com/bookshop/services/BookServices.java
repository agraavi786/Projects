package com.bookshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.dao.BookRepository;
import com.bookshop.entity.Book;

@Service
public class BookServices {
	@Autowired
	public BookRepository bookRepository;
	
	
	//get all books
	
	public List<Book> getBook(){
		
		List<Book> li=(List<Book>)this.bookRepository.findAll();
		return li;
		
	
		
	}
	
	//Create/add books
	
	public Book addBooks(Book b) {
		Book b1=this.bookRepository.save(b);
		
		return b1;
		
	}
	
	//delete book
	
	public void delBook(int id) {
		this.bookRepository.deleteById(id);
	}
	
	//update book
	
	public void updateBook(Book book , int id) {
		book.setId(id);
		
		this.bookRepository.save(book);
	}
	
	

}
