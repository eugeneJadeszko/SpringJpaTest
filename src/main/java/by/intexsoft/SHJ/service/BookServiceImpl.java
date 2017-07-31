package by.intexsoft.SHJ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.intexsoft.SHJ.entity.BookEntity;
import by.intexsoft.SHJ.repository.BookEntityRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookEntityRepository repository;

	public BookEntity addBook(BookEntity book) {
		BookEntity saveBook = repository.saveAndFlush(book);
		return saveBook;
	}

	@Override
	public List<BookEntity> findAll() {
		return repository.findAll();
	}
}