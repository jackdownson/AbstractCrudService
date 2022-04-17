package ru.pet.project.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.pet.project.dto.reponse.UserDto;
import ru.pet.project.entity.User;

import javax.swing.text.html.parser.Entity;

@Mapper(componentModel = "spring")
public interface UserMapper extends CommonMapper<User, UserDto>{
}
