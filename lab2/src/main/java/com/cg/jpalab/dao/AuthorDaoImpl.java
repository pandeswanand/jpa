package com.cg.jpalab.dao;

import com.cg.jpalab.dto.Author;
import com.cg.jpalab.dto.Book;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AuthorDaoImpl implements AuthorDao{

	static EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("JPALab");
	static EntityManager entityManager = entityFactory.createEntityManager();
	public Author addAuthor(Author author) {
		// TODO Auto-generated method stub
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Author foundAuthor = entityManager.find(Author.class, author.getAuthorId());
		if(foundAuthor == null) {
			entityManager.persist(author);
		}
		else {
			List<Book> list = author.getBook();
			list.add(foundAuthor);
		}
		entityManager.persist(author);
		transaction.commit();
		return author;
	}

	public Author searchAuthor(Integer authorId) {
		// TODO Auto-generated method stub
		Author searchedAuthor = entityManager.find(Author.class, authorId);
		return searchedAuthor;
	}

	public Author removeAuthor(Integer authorId) {
		// TODO Auto-generated method stub
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Author removeAuthor = entityManager.find(Author.class, authorId);
		entityManager.remove(removeAuthor);
		transaction.commit();
		return removeAuthor;
	}

	public Author updateAuthor(Author author) {
		// TODO Auto-generated method stub
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//		Author updateAuthor = entityManager.find(Author.class, author.getAuthorId());
//		if(updateAuthor == null) {
//			return null;
//		}
//		else {
//			Author updatedAuthor = entityManager.merge(updateAuthor);
//			return updatedAuthor;
//		}
		return null;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(book);
		transaction.commit();
		return book;
	}

	@Override
	public Book searchBook(Integer bookId) {
		// TODO Auto-generated method stub
		Book searchedBook = entityManager.find(Book.class, bookId);
		return searchedBook;
	}

	@Override
	public Book removeBook(Integer bookId) {
		// TODO Auto-generated method stub
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Book removeBook = entityManager.find(Book.class, bookId);
		entityManager.remove(removeBook);
		transaction.commit();
		return removeBook;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
