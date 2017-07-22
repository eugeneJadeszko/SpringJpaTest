package by.intexsoft.SHJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import by.intexsoft.SHJ.entity.BookEntity;
import by.intexsoft.SHJ.service.BookService;
import by.intexsoft.SHJ.service.BookServiceImpl;

/**
 * Hello world!
 *
 */
public class RunSHJ {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("by.intexsoft.SHJ.config");
		// BookService service = context.getBean(BookServiceImpl.class);
		BookService service = new BookServiceImpl();
		BookEntity book = new BookEntity();
		book.setAuthor("rakkkk");
		book.setBook("booook");
		book.setUser("raczona");
		service.addBook(book);
	}
}
