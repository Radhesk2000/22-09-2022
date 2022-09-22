package com.inheritence.exercises;

import com.inheritence.exercises.Author;
import com.inheritence.exercises.Book;

public class TestBookAuthor {

public static void main(String[] args) {

		Book b1= new Book();
		System.out.println(b1);
		
		Author A1 = new Author("Radheshyam","rsk@123.com");

		Book b2= new Book("ISBN1234","Golden", A1,240.0, 2);
		
		System.out.println(b2);
		
		System.out.println("**********************************");
		System.out.println("Name :"+b2.getName());
	
		System.out.println("Price :"+b2.getPrice());
		System.out.println("Quantity :"+b2.getQty());

		
		
		
	}
}
