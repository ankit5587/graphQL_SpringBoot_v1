package com.ankit.learn;

import com.ankit.learn.entities.Book;
import com.ankit.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book b1 =new Book();
		b1.setAuthor("Ankit");
		b1.setDesc("adcd");
		b1.setPages(200);
		b1.setPrice(999);
		b1.setTitle("new book");

		Book b2 =new Book();
		b2.setAuthor("Ankit");
		b2.setDesc("adcd");
		b2.setPages(200);
		b2.setPrice(999);
		b2.setTitle("new book");

		Book b3 =new Book();
		b3.setAuthor("Ankit");
		b3.setDesc("adcd");
		b3.setPages(200);
		b3.setPrice(999);
		b3.setTitle("new book");

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);

	}
}
