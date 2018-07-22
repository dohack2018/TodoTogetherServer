package de.todotogether.service;

import org.springframework.stereotype.Service;
import de.todotogether.bean.Todo;
import java.util.List;

@Service
public interface ITodoService {

    public List<Todo> findAll();
}
