package com.TaskManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskManager.entity.Tasks;
import com.TaskManager.repo.ITaskRepo;

@Service
public class TaskService implements ITaskService 
{
	@Autowired
	private ITaskRepo repo;
	
	
	
	public void setRepo(ITaskRepo repo) {
		this.repo = repo;
	}

	@Override
	public String setUserTask(Tasks task) {
		
		Tasks taskRe = repo.save(task);
		if(taskRe != null) {
			return "Task Saved Sucessfully";
		}
		else {
			return "Task Failed to save";
		}
		
	}

	@Override
	public String updateTheUserTask(Tasks task, Long id, String body, String subject, String status) {
		if (repo.existsById(id)) 
		{ 
            Integer num = repo.updateUserTask(task,id, body, subject, status); 
            System.out.println(num);
            	return "Task updated successfully";
            
        } else 
        {
            return "Task not found for update";
        }
	}

	@Override
	public String deleteUserTask(Long id) {
		
		if (repo.existsById(id) && id!=null) 
		{
            
            repo.deleteById(id);

            return "Task Deleted Successfully";
		}
		return "Task with ID " + id + " does not exist.";
        

	}

	@Override
	public List<Tasks> fetchAllUserTask() {
		return repo.findAll();
	}
		
}
