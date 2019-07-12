package com.tts.toDoListApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.toDoListApp.model.ToDoList;

@Repository
public interface ToDoListRepository extends CrudRepository<ToDoList, Long>
{
	public ToDoList findToDoListById(Long id);
	
	public List<ToDoList> findAll();

}
