package com.learning.Learning.Spring.boot.MVC.extensions.mappers;

import com.learning.Learning.Spring.boot.MVC.entities.User;
import com.learning.Learning.Spring.boot.MVC.extensions.dtos.UserDto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AutoMapper {
    public static UserDto mapToUserDTO(User user){
        UserDto userDto = UserDto.builder()
                .id(user.getId())
                .description(user.getDescription())
                .createdOn(user.getCreatedOn())
                .name(user.getName())
                .photoUrl(user.getPhotoUrl())
                .updatedOn(user.getUpdatedOn())
                .build();
        return userDto;
    }
    public static User mapToUser(UserDto userDto) {
        User user = User.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .photoUrl(userDto.getPhotoUrl())
                .description(userDto.getDescription())
                .createdOn(userDto.getCreatedOn())
                .updatedOn(LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC")))
                .build();
        return  user;
    }
}
