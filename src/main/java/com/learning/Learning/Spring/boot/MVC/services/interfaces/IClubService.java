package com.learning.Learning.Spring.boot.MVC.services.interfaces;

import com.learning.Learning.Spring.boot.MVC.entities.Club;
import com.learning.Learning.Spring.boot.MVC.extensions.dtos.ClubDto;

import java.util.List;

public interface IClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(Club club);
}
