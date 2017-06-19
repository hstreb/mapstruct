package org.example.mapstruct;

import java.time.LocalDate;
import java.util.Objects;

public class PersonDTO {
    private String name;
    private LocalDate birthday;
    private AddressDTO address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public PersonDTO withName(final String name) {
        this.name = name;
        return this;
    }

    public PersonDTO withBirthday(final LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public PersonDTO withAddress(final AddressDTO address) {
        this.address = address;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(name, personDTO.name) &&
                Objects.equals(birthday, personDTO.birthday) &&
                Objects.equals(address, personDTO.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonDTO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
