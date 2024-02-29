package com.nguyenduyhai.todoApp.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nguyenduyhai.todoApp.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
