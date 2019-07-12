package com.tts.toDoListApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.toDoListApp.model.ToDoList;
import com.tts.toDoListApp.repository.ToDoListRepository;

@Service
public class ToDoListServiceImpl implements ToDoListServiceInt
{
	@Autowired
	private ToDoListRepository toDoListRepository;
	
	@Override
	public List<ToDoList> findAll()
	{
		return toDoListRepository.findAll();
	}
	
	@Override
	public ToDoList findToDoListById(Long id)
	{
		return toDoListRepository.findToDoListById(id);
	}
	
	@Override
	public void saveToDoList(ToDoList listData)
	{
		toDoListRepository.save(listData);
	}
	
	@Override
	public void deleteToDoListById(Long id)
	{
		toDoListRepository.deleteById(id);
	}
	
}
