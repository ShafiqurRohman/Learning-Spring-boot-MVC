package com.learning.Learning.Spring.boot.MVC.services.interfaces;

import com.learning.Learning.Spring.boot.MVC.entities.User;
import com.learning.Learning.Spring.boot.MVC.extensions.dtos.UserDto;

import java.util.List;

public interface IUserService {
    List<UserDto> findAllUsers();
    User saveUser(UserDto User);
    UserDto findUserById(Long userId);
    void updateUser(UserDto userDto);
    void delete(long userId);
}
