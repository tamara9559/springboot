package co.edu.cue.practicaSpring_.controllers;

import co.edu.cue.practicaSpring_.domain.model.User;
import co.edu.cue.practicaSpring_.services.UserService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/get-user")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @DeleteMapping(value ="/delete-user/{id}")
    public void removeUserr(@PathVariable Long id) {
        userService.removeUser(id);
    }

    @PostMapping(value = "/add-user")
    public void removeUserr(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping(value = "/get-user-by-id/{id}")
    public User getUserById(@PathVariable String id) throws BadRequestException {
        if (id.equalsIgnoreCase("1")){
            return User.builder()
                   .id(1L)
                   .name("Monica")
                   .age(33)
                   .cellphone("1234")
                   .email("mtobon86@cue.edu.co")
                   .build();
        }
        throw new BadRequestException("invalid id");
    }
}
