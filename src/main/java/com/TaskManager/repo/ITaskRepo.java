package com.TaskManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.TaskManager.entity.Tasks;

import jakarta.transaction.Transactional;

public interface ITaskRepo extends JpaRepository<Tasks, Long> 
{
//	@Transactional
//	@Modifying
//	@Query("update task set status=:status body=:body subject:=subject getStatus where id=:id ")
//	public String updateUserTask(Long id, String body, String subject, String status);
	
	@Transactional
	@Modifying
	@Query("update Tasks t set t.status = :status, t.body = :body, t.subject = :subject where t.id = :id")
	public Integer updateUserTask(Tasks task ,Long id, String body, String subject, String status);

	
}
