package com.example.backend.repository;

import com.example.backend.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Random;

@Repository
public record ToDoRepository (
        List<ToDo> todos
) {
    public ToDo addToDo(ToDo toDoToAdd) {
        Random random = new Random();
        ToDo copy = new ToDo(String.valueOf(random.nextInt()), toDoToAdd.description(), toDoToAdd.status());
        todos.add(copy);
        return copy;
    }

    public ToDo getToDo(String id) {
        for (ToDo product : todos) {
            if (product.id().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public ToDo editToDo(String id, ToDo toDoToEdit) {
        int indexOfTodos = this.todos.indexOf(getToDo(id));
        this.todos.set(indexOfTodos, toDoToEdit);
    return toDoToEdit;
    }
    public String removeToDo(String id) {
       this.todos.remove(getToDo(id));
        return id;
    }
}