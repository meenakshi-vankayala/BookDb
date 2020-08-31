package com.example.BookDbDemo.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookDbDemo.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
