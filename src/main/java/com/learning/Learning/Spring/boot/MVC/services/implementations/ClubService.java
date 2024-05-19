package com.learning.Learning.Spring.boot.MVC.services.implementations;

import com.learning.Learning.Spring.boot.MVC.extensions.dtos.ClubDto;
import com.learning.Learning.Spring.boot.MVC.entities.Club;
import com.learning.Learning.Spring.boot.MVC.extensions.mappers.AutoMapper;
import com.learning.Learning.Spring.boot.MVC.repositories.interfaces.IClubRepository;
import com.learning.Learning.Spring.boot.MVC.services.interfaces.IClubService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubService implements IClubService {
    private IClubRepository clubRepository;

    public ClubService(IClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream()
                .map((club) -> AutoMapper.mapToClubDTO(club))
                .collect(Collectors.toList());
    }

    @Override
    public Club saveClub(Club club) {
        return clubRepository.save(club);
    }
}
