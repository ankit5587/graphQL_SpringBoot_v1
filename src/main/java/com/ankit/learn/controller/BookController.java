package com.ankit.learn.controller;

import com.ankit.learn.entities.Book;
import com.ankit.learn.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){

        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setPrice(book.getPrice());
        b.setAuthor(book.getAuthor());
        b.setPages(book.getPages());

        return this.bookService.create(b);
    }

    @QueryMapping("allBooks")
    public List<Book> getAllBook(){
       return  this.bookService.getAllBooks();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId){
        return this.bookService.getBook(bookId);
    }
}

@Getter
@Setter
class BookInput{
    private String title;
    private String desc;
    private String author;
    private float price;
    private int pages;

}