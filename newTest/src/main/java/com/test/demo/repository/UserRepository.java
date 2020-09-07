package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.test.demo.model.User;

@Component
public interface UserRepository extends JpaRepository<User, Integer> {

}
