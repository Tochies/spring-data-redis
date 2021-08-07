package com.tochie.springdataredis.resource;

import com.tochie.springdataredis.model.User;
import com.tochie.springdataredis.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;

    @GetMapping("/add/{id}/{name}")
    public User addUser(@PathVariable("id") final String id, @PathVariable("name") String name){

        userRepository.save(new User(id, 5000, name));

        return userRepository.findById(id) ;
    }

    @GetMapping("/update/{id}/{name}")
    public User updateUser(@PathVariable("id") final String id, @PathVariable("name") String name){

        userRepository.update(new User(id, 5000, name));

        return userRepository.findById(id) ;
    }

    @GetMapping("/all")
    public Map allUsers(){

        return userRepository.findAll() ;
    }



}
