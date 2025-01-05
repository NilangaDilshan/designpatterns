package com.dilshan.designPatterns.latest.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String fName);

    UserDTOBuilder withLastName(String lName);

    UserDTOBuilder withBirthday(LocalDate birthday);

    UserDTOBuilder withAddress(Address address);

    UserDTO build();

    UserDTO getUserDTO();
}
