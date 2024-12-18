package com.TaskManager.controller;

import java.io.ObjectInputFilter.Status;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import com.TaskManager.entity.Tasks;
import com.TaskManager.service.TaskService;

@RestController
public class TaskController 
{
	 	@Autowired
	    private TaskService taskService;

	    // Endpoint to create a new task
	    @PostMapping("/addtask")
	    public ResponseEntity<String> createTask(@RequestBody Tasks task) {
	        String response = taskService.setUserTask(task);
	        return ResponseEntity.ok(response);
	    }

	    // Endpoint to update an existing task
	    @PutMapping("/updatetask/{id}")
	    public ResponseEntity<String> updateTask(@PathVariable Long id, @RequestBody Tasks task) {
	        // Ensure the task ID matches the path variable
	    	String body = task.getBody();
	    	String subject = task.getSubject();
	    	String status = task.getStatus();
	    	
	        String response = taskService.updateTheUserTask(task, id,body,subject,status);
	        return ResponseEntity.ok(response);
	    }

	    // Endpoint to delete a task by ID
	    @DeleteMapping("/deletetask/{id}")
	    public ResponseEntity<String> deleteTask(@PathVariable Long id) {
	        if(id==null)
	        {
	        	String res = "Enter Valid Id";
	        	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(res);
	        }
	    	String response = taskService.deleteUserTask(id);
	        return ResponseEntity.ok(response);
	    }

	    // Endpoint to fetch all tasks
	    @GetMapping("/getalltasks")
	    public ResponseEntity<List<Tasks>> getAllTasks() {
	        List<Tasks> tasks = taskService.fetchAllUserTask();
	        return new ResponseEntity<List<Tasks>>(tasks,HttpStatus.OK);
	        
	    } 
	    
	    @GetMapping("/**")
	    public String errors() {
	        
	        return "Try again someting went wrong; Their is no such API available";
	    }
	    
	    
}
