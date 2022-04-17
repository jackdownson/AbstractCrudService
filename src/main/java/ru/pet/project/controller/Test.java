package ru.pet.project.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pet.project.dto.reponse.UserDto;
import ru.pet.project.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/test")
public class Test {

    private UserService userService;

    @GetMapping
    public List<UserDto> findAll(){
        return userService.findAll();
    }
}
