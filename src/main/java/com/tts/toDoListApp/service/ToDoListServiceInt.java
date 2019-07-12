package com.tts.toDoListApp.service;

import java.util.List;

import com.tts.toDoListApp.model.ToDoList;

public interface ToDoListServiceInt {
	
	public List<ToDoList> findAll();
	public ToDoList findToDoListById(Long id);
	public void deleteToDoListById(Long id);
	public void saveToDoList(ToDoList listData);
	
}
