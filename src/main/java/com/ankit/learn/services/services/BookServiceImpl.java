package com.ankit.learn.services.services;

import com.ankit.learn.entities.Book;
import com.ankit.learn.repositories.BookRepo;
import com.ankit.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo){
        this.bookRepo=bookRepo;
    }
    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book getBook(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(()->new RuntimeException("Book not found"));
    }
}
