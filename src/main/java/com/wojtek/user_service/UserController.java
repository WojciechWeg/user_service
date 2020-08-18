package com.wojtek.user_service;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController {

    public static final String BASE_URL = "user";

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping()
    public void createNewUser(@Valid @RequestBody User user) {
        userService.createNewUser(user);
    }

    @PostMapping("/{userLogin}")
    public void update(@PathVariable String userLogin, @Valid @RequestBody User user){ userService.updateUser(userLogin,user); }

    @DeleteMapping({"/{userLogin}"})
    public void delete(@PathVariable String userLogin){
        userService.delete(userLogin);
    }

    @GetMapping({"","/"})
    public List<UserNoPassword> getAllUser(){
       return userService.getAllUsers();
    }

    @GetMapping({"/{userName}"})
    public Optional<UserEntity> getUserById(@PathVariable String userName){
        return userService.getUserById(userName);
    }
}
