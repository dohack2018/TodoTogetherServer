package de.todotogether.service;

import org.springframework.stereotype.Service;
import de.todotogether.bean.User;
import java.util.List;

@Service
public interface IUserService {

    public List<User> findAll();
}
