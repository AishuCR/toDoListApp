package com.tts.toDoListApp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.tts.toDoListApp.model.ToDoList;
import com.tts.toDoListApp.repository.ToDoListRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ToDoRepositoryTest {
	
	private static ToDoList listItem;
	private static List<ToDoList> toDoList;
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private ToDoListRepository toDoListRepository;
	
	@Before
	public void setUp()
	{
		listItem = new ToDoList("Need to update profile");
		testEntityManager.persistAndFlush(listItem);
	}
	
	
	
	
	@Test
	public void getToDoListById_thenReturnToDoList()
	{
		ToDoList found = toDoListRepository.findToDoListById(listItem.getId());
		assertThat(listItem).isEqualToComparingFieldByField(found);
	}
	
	@Test
	public void givenToDoList_returnAllToDoList()
	{
		List<ToDoList> found = toDoListRepository.findAll();
		assertEquals(toDoList, found);
	}

}
