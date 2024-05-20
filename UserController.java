package com.learning.Learning.Spring.boot.MVC.controllers;
import com.learning.Learning.Spring.boot.MVC.extensions.dtos.UserDto;
import com.learning.Learning.Spring.boot.MVC.services.interfaces.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    private  IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }
    @Operation(summary = "Get greeting message", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/users")
    public String listUsers(Model model){
        List<UserDto> users = userService.findAllUsers();
        model.addAttribute("Users", users);
        return "users-list";
    }
    @Operation(summary = "Get greeting message", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/users/new")
    public String createUserForm(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("User", userDto);
        return "users-create";
    }
    @Operation(summary = "Post create new User", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @PostMapping("/users/new")
    public String saveUser(@ModelAttribute("User") UserDto userDto) {
        userService.saveUser(userDto);
        return "redirect:/users";
    }

    @Operation(summary = "Post create new User", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/users/{userId}/edit")
    public String editClubForm(@PathVariable("userId") Long userId, Model model) {
        UserDto userDto = userService.findUserById(userId);
        model.addAttribute("User", userDto);
        return "users-edit";
    }

    @Operation(summary = "Post create new User", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @PostMapping("/users/{userId}/edit")
    public String updateClub(@PathVariable("userId") Long userId, @ModelAttribute("User") UserDto userDto) {
        userDto.setId(userId);
        userService.updateUser(userDto);
        return "redirect:/users";
    }

    @Operation(summary = "Post create new User", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/users/{userId}/delete")
    public String deleteUser(@PathVariable("userId") Long userId){
        userService.delete(userId);
        return "redirect:/users";
    }

}
