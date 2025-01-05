package com.dilshan.designPatterns.latest.creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder withFirstName(String fName) {
        this.firstName = fName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lName) {
        this.lastName = lName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period ageInYears = Period.between(birthday, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = String.join(",\n", address.getStreet(), address.getCity(), address.getState(),
                address.getZipCode());
        return this;
    }

    @Override
    public UserDTO build() {
        this.userWebDTO = new UserWebDTO(String.format("%s %s", this.firstName, this.lastName), this.address, this.age);
        return this.userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return this.userWebDTO;
    }
}
