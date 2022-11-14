package com.example.backend.service;

import com.example.backend.model.ToDo;
import com.example.backend.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


    public ToDo addToDo(ToDo toDo) {
        return toDoRepository.addToDo(toDo);
    }
    public ToDo getToDo(String id ) {
        return toDoRepository.getToDo(id);
    }
    public List<ToDo> getToDos() {
        return toDoRepository.todos();
    }


    public String removeToDo(String id) {
        return toDoRepository.removeToDo(id);
    }

    public ToDo editToDo(String id, ToDo toDoToEdit) {
        return toDoRepository.editToDo(id, toDoToEdit);

    }
}