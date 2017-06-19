package org.example.mapstruct;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

public class Person {

    @NotNull(message = "Name must be informed.")
    private String name;
    private LocalDate birthday;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person withName(final String name) {
        this.name = name;
        return this;
    }

    public Person withBirthday(final LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public Person withAddress(final Address address) {
        this.address = address;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(birthday, person.birthday) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
