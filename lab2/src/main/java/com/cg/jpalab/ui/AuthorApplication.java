package com.cg.jpalab.ui;

import java.util.*;

import com.cg.jpalab.dto.Author;
import com.cg.jpalab.dto.Book;
import com.cg.jpalab.service.Service;
import com.cg.jpalab.service.ServiceImpl;

public class AuthorApplication {

	static Service service = new ServiceImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter your choice:");
			System.out.println("1.Add Author");
			System.out.println("2.Update Author");
			System.out.println("3.Search Author");
			System.out.println("4.Remove Author");
			System.out.println("5.Add Book");
			System.out.println("6.Update Book");
			System.out.println("7.Search Book");
			System.out.println("8.Remove Book");
			System.out.println("9.Exit");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Author Id");
				int id = scanner.nextInt();
				System.out.println("Enter First Name");
				String fname = scanner.next();
				System.out.println("Enter Middle Name");
				String mname = scanner.next();
				System.out.println("Enter Last Name");
				String lname = scanner.next();
				System.out.println("Enter Phone Number");
				long phoneNo = scanner.nextLong();
				System.out.println("Enter Book Id");
				int bookId = scanner.nextInt();
				System.out.println("Enter Book Name");
				String bookName = scanner.next();
				System.out.println("Enter Book Cost");
				double bookCost = scanner.nextDouble();
				Author author = new Author();
				Book book = new Book();
				author.setAuthorId(id);
				author.setFirstName(fname);
				author.setMiddleName(mname);
				author.setLastName(lname);
				author.setPhoneNo(phoneNo);
				
				book.setBookId(bookId);
				book.setBookName(bookName);
				book.setBookCost(bookCost);
				List<Book> booklist = author.getBook();
				booklist.add(book);
				author.setBook(booklist);
				
				service.addAuthor(author);
				break;
			case 2:
				System.out.println("Enter updated Author Id");
				int updatedId = scanner.nextInt();
				System.out.println("Enter updated First Name");
				String updatedFname = scanner.next();
				System.out.println("Enter updated Middle Name");
				String updatedMname = scanner.next();
				System.out.println("Enter updated Last Name");
				String updatedLname = scanner.next();
				System.out.println("Enter updated Phone Number");
				long updatedPhoneNo = scanner.nextLong();
				Author authorOne = new Author();
				authorOne.setAuthorId(updatedId);
				authorOne.setFirstName(updatedFname);
				authorOne.setFirstName(updatedMname);
				authorOne.setFirstName(updatedLname);
				authorOne.setPhoneNo(updatedPhoneNo);
				
				service.addAuthor(authorOne);
				break;
			case 3:
				System.out.println("Enter Author Id to be searched");
				int searchAuthorId = scanner.nextInt();
				Author searchedAuthor = service.searchAuthor(searchAuthorId);
				if(searchedAuthor != null) {
					System.out.println("Author Found "+searchedAuthor.toString());
				}
				else {
					System.out.println("Author not present!");
				}
				break;
			case 4:
				System.out.println("Enter Author Id to be removed");
				int removeAuthorId = scanner.nextInt();
				Author removedAuthor = service.removeAuthor(removeAuthorId);
				if(removedAuthor != null) {
					System.out.println("Author Removed "+removedAuthor.toString());
				}
				else {
					System.out.println("Author could not be removed!");
				}
				break;
			case 5:
//				System.out.println("Enter Book Id");
//				int book_Id = scanner.nextInt();						
//				System.out.println("Enter Book Name");
//				String bookname = scanner.next();
//				System.out.println("Enter Book Cost");
//				double book_Cost = scanner.nextDouble();
//				Book bookOne = new Book();
//				bookOne.setBookId(book_Id);
//				bookOne.setBookName(bookname);
//				bookOne.setBookCost(book_Cost);
//				if(booklist.contains(o))
//				author.setBook(booklist);
//				
//				service.addAuthor(author);
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("Enter choice between 1 and 5 only!");
				break;
			}
		}while(choice != 9);
	}

}
