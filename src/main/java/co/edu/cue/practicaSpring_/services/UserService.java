package co.edu.cue.practicaSpring_.services;

import co.edu.cue.practicaSpring_.domain.model.User;
import co.edu.cue.practicaSpring_.domain.model.Users;

import java.util.List;

public interface UserService {

    List<Users> getUsers();
    void removeUser(Long id);
    void addUser(Users user);
}
