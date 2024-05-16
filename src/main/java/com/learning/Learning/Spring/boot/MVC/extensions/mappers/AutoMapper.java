package com.learning.Learning.Spring.boot.MVC.extensions.mappers;

import com.learning.Learning.Spring.boot.MVC.entities.Club;
import com.learning.Learning.Spring.boot.MVC.extensions.dtos.ClubDto;

public class AutoMapper {
    public static ClubDto mapToClubDTO(Club club){
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .updatedOn(club.getUpdatedOn())
                .build();
        return clubDto;
    }
}
