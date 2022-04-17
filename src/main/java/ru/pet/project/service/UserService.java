package ru.pet.project.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pet.project.dto.reponse.UserDto;
import ru.pet.project.mapper.UserMapper;
import ru.pet.project.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public List<UserDto> findAll(){
        return userMapper.toEntity(userRepository.findAll());
    }
}
