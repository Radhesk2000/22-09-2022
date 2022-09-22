package com.inheritence.exercises;

public class Author {
	
	private String name;
	private String email;
	
	public Author() {
		
	}
	public Author(String name, String email) {
		this.name=name;
		this.email=email;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public void setEmail(String email){
		this.email=email;
	}
	
	@Override
	public String toString(){
				
		return "Autour Name :"+name+" Email :"+email;
	}
}
