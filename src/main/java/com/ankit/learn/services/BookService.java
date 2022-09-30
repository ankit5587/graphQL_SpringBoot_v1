package com.ankit.learn.services;

import com.ankit.learn.entities.Book;

import java.util.List;

public interface BookService  {

  Book create(Book book);

  List<Book> getAllBooks();

  Book getBook(int bookId);

}
