package co.edu.cue.practicaSpring_.controllers;


import co.edu.cue.practicaSpring_.domain.model.Users;
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
    public List<Users> getAllUsers() {
        return userService.getUsers();
    }

    @DeleteMapping(value ="/delete-user/{id}")
    public void removeUserr(@PathVariable Long id) {
        userService.removeUser(id);
    }

    @PostMapping(value = "/add-user")
    public void removeUserr(@RequestBody Users user) {
        userService.addUser(user);
    }

    @GetMapping(value = "/get-user-by-id/{id}")
    public Users getUserById(@PathVariable String id) throws BadRequestException {
        if (id.equalsIgnoreCase("1")){
            return Users.builder()
                   .id(1L)
                    .username("Monica")
                   .email("mtobon86@cue.edu.co")
                    .password("12345")
                   .build();
        }
        throw new BadRequestException("invalid id");
    }
}
