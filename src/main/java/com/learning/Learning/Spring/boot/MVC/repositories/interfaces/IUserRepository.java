package com.learning.Learning.Spring.boot.MVC.repositories.interfaces;


import com.learning.Learning.Spring.boot.MVC.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String url);
}
