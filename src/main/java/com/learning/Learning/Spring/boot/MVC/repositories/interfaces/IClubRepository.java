package com.learning.Learning.Spring.boot.MVC.repositories.interfaces;


import com.learning.Learning.Spring.boot.MVC.entities.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IClubRepository extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String url);
}
