package com.dilshan.designPatterns.latest.creational.builder;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserWebDTO implements UserDTO{
    private String name;
    private String address;
    private String age;
}
