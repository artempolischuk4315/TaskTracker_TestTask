package com.ua.polishchuk.repository;

import com.ua.polishchuk.entity.Task;
import com.ua.polishchuk.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    Optional<Task> findByTitle(String title);

    List<Task> findByStatus(TaskStatus status);
}
