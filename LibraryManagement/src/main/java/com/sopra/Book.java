package com.sopra;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private boolean status;
	
	
	public Book(int id, String name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	public Book() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	
	
	
	

}
