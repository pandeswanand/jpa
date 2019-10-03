package com.cg.jpalab.service;

import com.cg.jpalab.dao.AuthorDao;
import com.cg.jpalab.dao.AuthorDaoImpl;
import com.cg.jpalab.dto.Author;
import com.cg.jpalab.dto.Book;

public class ServiceImpl implements Service{

	AuthorDao dao = new AuthorDaoImpl();
	@Override
	public Author addAuthor(Author author) {
		// TODO Auto-generated method stub
		return dao.addAuthor(author);
	}

	@Override
	public Author searchAuthor(Integer authorId) {
		// TODO Auto-generated method stub
		return dao.searchAuthor(authorId);
	}

	@Override
	public Author removeAuthor(Integer authorId) {
		// TODO Auto-generated method stub
		return dao.removeAuthor(authorId);
	}

	@Override
	public Author updateAuthor(Author author) {
		// TODO Auto-generated method stub
		return dao.updateAuthor(author);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return dao.addBook(book);
	}

	@Override
	public Book searchBook(Integer bookId) {
		// TODO Auto-generated method stub
		return dao.searchBook(bookId);
	}

	@Override
	public Book removeBook(Integer bookId) {
		// TODO Auto-generated method stub
		return dao.removeBook(bookId);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return dao.updateBook(book);
	}

	
}
