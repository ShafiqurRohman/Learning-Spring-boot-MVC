package com.learning.Learning.Spring.boot.MVC.services.implementations;

import com.learning.Learning.Spring.boot.MVC.extensions.dtos.UserDto;
import com.learning.Learning.Spring.boot.MVC.entities.User;
import com.learning.Learning.Spring.boot.MVC.extensions.mappers.AutoMapper;
import com.learning.Learning.Spring.boot.MVC.repositories.interfaces.IUserRepository;
import com.learning.Learning.Spring.boot.MVC.services.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {
    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findAllUsers() {
        List<User> Users = userRepository.findAll();
        return Users.stream()
                .map((User) -> AutoMapper.mapToUserDTO(User))
                .collect(Collectors.toList());
    }

    @Override
    public User saveUser(UserDto userDto) {
        User user = AutoMapper.mapToUser(userDto);
        return userRepository.save(user);
    }

    @Override
    public UserDto findUserById(Long UserId) {
        User user = userRepository.findById(UserId).get();
        return AutoMapper.mapToUserDTO(user);
    }

    @Override
    public void updateUser(UserDto userDto) {
        User user = AutoMapper.mapToUser(userDto);
        userRepository.save(user);
    }

    @Override
    public void delete(long userId){
        userRepository.deleteById(userId);
    }
}
