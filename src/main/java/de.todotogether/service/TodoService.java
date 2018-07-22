package de.todotogether.service;

import de.todotogether.bean.Todo;
import de.todotogether.repository.TodoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoRepository repository;

    @Override
    public List<Todo> findAll() {

        List<Todo> todos = (List<Todo>) repository.findAll();
        
        return todos;
    }
}
