package com.Nayan.Music_Streaming.service.impl;

import com.Nayan.Music_Streaming.entity.User;
import com.Nayan.Music_Streaming.repository.UserRepository;
import com.Nayan.Music_Streaming.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    @Override
    public User create(User user) {
        return repo.save(user);
    }

    @Override
    public User getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User update(Long id, User user) {
        User old = repo.findById(id).orElseThrow();
        old.setUsername(user.getUsername());
        return repo.save(old);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
