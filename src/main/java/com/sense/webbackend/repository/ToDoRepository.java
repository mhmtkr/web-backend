package com.sense.webbackend.repository;

import com.sense.webbackend.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

}
