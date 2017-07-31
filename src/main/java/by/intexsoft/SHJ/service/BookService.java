package by.intexsoft.SHJ.service;

import java.util.List;

import by.intexsoft.SHJ.entity.BookEntity;

public interface BookService {
	BookEntity addBook(BookEntity book);

	List<BookEntity> findAll();
}
