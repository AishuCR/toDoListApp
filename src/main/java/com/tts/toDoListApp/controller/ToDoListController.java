package com.tts.toDoListApp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.toDoListApp.model.ToDoList;
import com.tts.toDoListApp.service.ToDoListServiceImpl;

@Controller
public class ToDoListController {
	
	@Autowired
	ToDoListServiceImpl toDoListServiceImpl;
	
	@GetMapping("/")
		public String index(ToDoList toDoList)
		{
			return "index";
		}
	
	@GetMapping("/alllist")
	public String allList()
	{
		return "toDoList";
	}
	
	@PostMapping("/")
	public String addListForm(ToDoList toDoList, Model model)
	{
		toDoListServiceImpl.saveToDoList(toDoList);
		model.addAttribute("successMessage", "Added the list");
		return "toDoList";
		
	}
	
	@GetMapping("/toDoList")
	public String getAllToDoList(Model model, ToDoList toDoList)
	{
		List<ToDoList> entireList = toDoListServiceImpl.findAll();
		model.addAttribute("allList", entireList);
		return "toDoList";
	}
	
	
	
	
	

}
