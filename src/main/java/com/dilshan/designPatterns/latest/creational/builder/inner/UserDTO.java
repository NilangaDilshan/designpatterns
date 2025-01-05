package com.dilshan.designPatterns.latest.creational.builder.inner;

import com.dilshan.designPatterns.latest.creational.builder.Address;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class UserDTO {

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public static class UserDTOBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;

        public UserDTOBuilder withFirstName(String fName) {
            this.firstName = fName;
            return this;
        }

        public UserDTOBuilder withLastName(String lName) {
            this.lastName = lName;
            return this;
        }

        public UserDTOBuilder withAge(LocalDate birthday) {
            this.age = Integer.toString(LocalDate.now().getYear() - birthday.getYear());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = String.join(",\n", address.getStreet(), address.getCity(), address.getState(), address.getZipCode());
            return this;
        }

        public UserDTO build() {
            UserDTO userDTO = new UserDTO();
            userDTO.setName(String.format("%s %s", this.firstName, this.lastName));
            userDTO.setAddress(this.address);
            userDTO.setAge(this.age);
            return userDTO;
        }

        public UserDTO getUserDTO() {
            return new UserDTO();
        }
    }

    public static void main(String[] args) {
        UserDTO userDTO = new UserDTO.UserDTOBuilder()
                .withFirstName("Dilshan")
                .withLastName("Wijetunga")
                .withAge(LocalDate.of(1990, 1, 1))
                .withAddress(new Address("123 Main St", "Colombo", "Western", "12345"))
                .build();
        log.info("User DTO Name: {}", userDTO.getName());
        log.info("User DTO Age: {}", userDTO.getAge());
        log.info("User DTO Address: {}", userDTO.getAddress());
    }
}
