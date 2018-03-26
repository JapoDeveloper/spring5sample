package co.japo.spring5sample.controllers;

import co.japo.spring5sample.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created in IntelliJ IDEA.
 * User: JapoDeveloper
 * Date: 3/25/18
 * Time: 8:50 PM
 */

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());
        return "books";
    }
}
