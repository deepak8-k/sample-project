package com.sopra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sopra.Book;
import com.sopra.repository.BookRepository;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookRepository bookRepo;

	@RequestMapping("/index")
	public String home(Model model) {
		model.addAttribute("appName", "Spring boot web application.");
		return "home";
	}

	@RequestMapping("/display")
	public String displayDrinkInfo(Model model) {

		List<Book> books = (List<Book>) bookRepo.findAll();

		model.addAttribute("books", books);
		model.addAttribute("msg", "Welcome to the Library section.");

		return "displayBook";
	}

	@GetMapping("/borrow/{id}")
	public String borrowBook(@PathVariable String id, Model model) {

		Book book = bookRepo.findById(Integer.parseInt(id)).get();

		model.addAttribute("book", book);

		return "bookForm";
	}
	   @PostMapping("/save")
	    public String saveBook(@ModelAttribute("book") Book book,Model model) {
	      book.setStatus(true);
	      bookRepo.save(book);
	      model.addAttribute("msg","Book Borrowed successfully");
	      return displayDrinkInfo(model);
	        
	    }
	    @GetMapping("/add")
	    public String add() {
	        return "add";
	    }
	    @PostMapping("/addBook")
	    public String addBook(@ModelAttribute("Book") Book book,Model model) {
	      book.setStatus(false);
	      bookRepo.save(book);
	      model.addAttribute("msg","Book Added successfully");
	      return displayDrinkInfo(model);
	        
	    }



}
