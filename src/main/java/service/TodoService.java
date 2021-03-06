package src.main.java.service;

import src.main.java.Todo;
import src.main.java.repository.TodoRepository;
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
