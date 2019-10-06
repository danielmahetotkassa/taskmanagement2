package com.odyssey.todomanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odyssey.todomanagement.model.ToDo;

@RestController
public class RestControllerExample {
	
	
	List<ToDo> todos = new ArrayList<>();
	
	
	@GetMapping(value = "/todos", produces = { "application/xml", "text/xml" })
	public List<ToDo> getTodos() {
		
		todos.add(new ToDo("this is the first todo"));
		todos.add(new ToDo("this is the second todos"));
		todos.add(new ToDo("this is the third todos"));
		todos.add(new ToDo("this is the fourth todos"));
		
		return todos;
	}
	
	
	

}
