package com.Nayan.Music_Streaming.controller;

import com.Nayan.Music_Streaming.entity.User;
import com.Nayan.Music_Streaming.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    @PostMapping
    public User create(@RequestBody User user){
        return service.create(user);
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping
    public List<User> all(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user){
        return service.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}

