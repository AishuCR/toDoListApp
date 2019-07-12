package com.tts.toDoListApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.toDoListApp.model.ToDoList;
import com.tts.toDoListApp.service.ToDoListServiceImpl;

@RestController
@RequestMapping("/api")
public class ToDoListApiController {
	
	@Autowired
	private ToDoListServiceImpl toDoListServiceImpl;
	
	@GetMapping("/toDoList/{id}")
	public ToDoList findById(@PathVariable("id") Long id)
	{
		return toDoListServiceImpl.findToDoListById(id);
	}
	
	@GetMapping("/toDoList")
	public List<ToDoList> getAllList()
	{
		return toDoListServiceImpl.findAll();
	}
	
	@PostMapping("/toDoList/new")
	public String createList(ToDoList toDoList)
	{
		toDoListServiceImpl.saveToDoList(toDoList);
		return "List created Successfully";
	}
	
	@DeleteMapping("/toDoList/{id}")
	public String deleteListById(@PathVariable("id") Long id)
	{
		toDoListServiceImpl.deleteToDoListById(id);
		return "List deleted Successfully";
	}
	

	
	//need to add a mapping to delete list by id
	
	//need to add a mapping to update list by id
}
