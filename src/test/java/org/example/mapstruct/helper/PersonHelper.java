package org.example.mapstruct.helper;

import org.example.mapstruct.Address;
import org.example.mapstruct.AddressDTO;
import org.example.mapstruct.Person;
import org.example.mapstruct.PersonDTO;

import java.time.LocalDate;

public class PersonHelper {

    public static final LocalDate NOW = LocalDate.now();

    public static Person buildPerson() {
        return new Person()
                .withName("John Doe")
                .withBirthday(NOW)
                .withAddress(new Address()
                        .withStreet("Firsth Avenue")
                        .withNumber(10)
                        .withCity("Metropolis"));
    }

    public static PersonDTO buildPersonDTO() {
        return new PersonDTO()
                .withName("John Doe")
                .withBirthday(NOW)
                .withAddress(new AddressDTO()
                        .withStreet("Firsth Avenue")
                        .withNumber(10)
                        .withCity("Metropolis"));
    }
}
