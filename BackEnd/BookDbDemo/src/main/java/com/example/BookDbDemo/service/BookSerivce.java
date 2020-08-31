package com.example.BookDbDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookDbDemo.Dao.BookRepository;
import com.example.BookDbDemo.model.Book;

@Service
public class BookSerivce {
	
	@Autowired
	BookRepository bookRepository;

	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	public Book getBookById(int bookId) {
		return bookRepository.findById(bookId).get();
	}
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public void deleteBook(int bookId) {
		bookRepository.deleteById(bookId);
	}
	
	public void updateBook(Book book, int bookId) {
		bookRepository.save(book);
	}
}
