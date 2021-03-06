package fi.haagahelia.course.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.course.domain.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repository; 
	
	/**
	 * Show list of all books
	 * 
	 * @param model
	 * @return
	 */
    @RequestMapping(value="/")
    public String studentList(Model model) {	
        model.addAttribute("books", repository.findAll());
        return "booklist";
    }
}
