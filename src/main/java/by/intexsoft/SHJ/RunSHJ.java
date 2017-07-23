package by.intexsoft.SHJ;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import by.intexsoft.SHJ.entity.BookEntity;
import by.intexsoft.SHJ.service.BookService;
import by.intexsoft.SHJ.service.BookServiceImpl;

public class RunSHJ {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("by.intexsoft.SHJ.config");
		BookService service = context.getBean(BookServiceImpl.class);
		// Arrays.asList(context.getBeanDefinitionNames()).forEach(bean ->
		// System.out.println(bean));
		BookEntity book = new BookEntity();
		book.setAuthor("author1");
		book.setBook("book1");
		book.setUser("user1");
		System.out.println(service.addBook(book) != null ? "done!" : "error...");
	}
}
