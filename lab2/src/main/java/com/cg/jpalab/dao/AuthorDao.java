package com.cg.jpalab.dao;

import com.cg.jpalab.dto.Author;
import com.cg.jpalab.dto.Book;

public interface AuthorDao {

	public Author addAuthor(Author author);
	public Author searchAuthor(Integer authorId);
	public Author removeAuthor(Integer authorId);
	public Author updateAuthor(Author author);
	public Book addBook(Book book);
	public Book searchBook(Integer bookId);
	public Book removeBook(Integer bookId);
	public Book updateBook(Book book);
}
