package com.dilshan.designPatterns.latest.solid.interfacesegregation;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User extends Entity{
    private String name;
    private LocalDateTime lastLogin;

    public User(Long id, String name, LocalDateTime lastLogin) {
        super(id);
        this.name = name;
        this.lastLogin = lastLogin;
    }

}
