package com.learning.Learning.Spring.boot.MVC.controllers;

import com.learning.Learning.Spring.boot.MVC.entities.Club;
import com.learning.Learning.Spring.boot.MVC.extensions.dtos.ClubDto;
import com.learning.Learning.Spring.boot.MVC.services.implementations.ClubService;
import com.learning.Learning.Spring.boot.MVC.services.interfaces.IClubService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClubController {
    private  IClubService clubService;

    @Autowired
    public ClubController(IClubService clubService) {
        this.clubService = clubService;
    }
    @Operation(summary = "Get greeting message", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/clubs")
    public String listClubs(Model model){
        List<ClubDto> clubs = clubService.findAllClubs();
        model.addAttribute("clubs", clubs);
        return "clubs-list";
    }
    @Operation(summary = "Get greeting message", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/clubs/new")
    public String createClubForm(Model model) {
        Club club = new Club();
        model.addAttribute("club", club);
        return "clubs-create";
    }
    @Operation(summary = "Post create new club", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @PostMapping("/clubs/new")
    public String saveClub(@ModelAttribute("club") Club club) {
        clubService.saveClub(club);
        return "redirect:/clubs";
    }

}
