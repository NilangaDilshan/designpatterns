package com.dilshan.designPatterns.latest.creational.builder;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        UserDTO dto = createDTO();
        log.info("User DTO Name: {}", dto.getName());
        log.info("User DTO Age: {}", dto.getAge());
        log.info("User DTO Address: {}", dto.getAddress());
    }

    private static UserDTO createDTO() {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    private static User createUser() {
        User user = new User();
        user.setFirstName("Dilshan");
        user.setLastName("Wijetunga");
        user.setBirthday(LocalDate.of(1990, 1, 1));
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Colombo");
        address.setState("Western");
        address.setZipCode("12345");
        user.setAddress(address);
        return user;
    }
}
