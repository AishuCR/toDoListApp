package com.tts.toDoListApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDoList {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String title;
	private String content;
	
	public ToDoList(){}
	
	public ToDoList(String title, String content) 
	{
		this.title = title;
		this.content = content;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getId() {
		return id;
	}
	
	

}
