package com.Nayan.Music_Streaming.repository;

import com.Nayan.Music_Streaming.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

