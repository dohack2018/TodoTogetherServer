package src.main.java.service;

import src.main.java.User;
import src.main.java.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {

        List<User> users = (List<User>) repository.findAll();
        
        return users;
    }
}
