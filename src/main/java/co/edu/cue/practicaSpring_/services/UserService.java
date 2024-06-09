package co.edu.cue.practicaSpring_.services;

import co.edu.cue.practicaSpring_.domain.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    void removeUser(Long id);
    void addUser(User user);
}
