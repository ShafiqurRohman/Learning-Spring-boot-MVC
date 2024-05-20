package com.learning.Learning.Spring.boot.MVC.extensions.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private long id;
    private String name;
    private String photoUrl;
    private String description;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
