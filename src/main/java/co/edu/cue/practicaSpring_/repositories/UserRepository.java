package co.edu.cue.practicaSpring_.repositories;

import co.edu.cue.practicaSpring_.domain.model.User;

import java.util.List;

public interface UserRepository {

    public List<User> ListUsers();

    void removeUser(Long id);

    void addUser(User user);
}
