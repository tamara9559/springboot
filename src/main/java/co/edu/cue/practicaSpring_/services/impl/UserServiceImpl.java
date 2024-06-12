package co.edu.cue.practicaSpring_.services.impl;

import co.edu.cue.practicaSpring_.domain.model.User;
import co.edu.cue.practicaSpring_.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getUsers() {
        return repository.ListUsers();
    }

    @Override
    public void removeUser(Long id) {
        repository.removeUser(id);
    }

    @Override
    public void addUser(User user) {
        repository.addUser(user);
    }
}
