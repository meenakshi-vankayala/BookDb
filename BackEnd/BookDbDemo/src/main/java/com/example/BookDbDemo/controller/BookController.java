package com.example.BookDbDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookDbDemo.model.Book;
import com.example.BookDbDemo.service.BookSerivce;

@RestController
public class BookController {

	@Autowired
	BookSerivce bookService;
	
	@RequestMapping("/bookList")
	public List<Book> getAllBooks() {
		return bookService.getBooks();
	}
	
	@RequestMapping("/book/{id}")
	public Book getBookById(@PathVariable int id) {
		return bookService.getBookById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST ,value = "/addBook")
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteBook/{bookId}")
	public void deleteBook(@PathVariable int bookId) {
		bookService.deleteBook(bookId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/updateBook/{bookId}")
	public void updateBook(@RequestBody Book book, @PathVariable int bookId) {
		book.setBookId(bookId);
		bookService.updateBook(book, bookId);
	}
}
