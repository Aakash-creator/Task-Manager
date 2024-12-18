package com.TaskManager.service;

import java.util.List;


import com.TaskManager.entity.Tasks;


public interface ITaskService 
{
	public String setUserTask(Tasks task);
	
	public String updateTheUserTask(Tasks task, Long id, String body, String subject, String status);
	
	public String deleteUserTask(Long id);
	
	public List<Tasks> fetchAllUserTask();
	
}
