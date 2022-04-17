package ru.pet.project.dto.reponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Data
public class UserDto {

    private UUID uuid;
    private String username;
    private String email;
    private String password;
}
