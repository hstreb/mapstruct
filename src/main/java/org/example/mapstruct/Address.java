package org.example.mapstruct;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Address {

    @NotNull(message = "Street must be informed.")
    private String street;
    private Integer number;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address withStreet(final String street) {
        this.street = street;
        return this;
    }

    public Address withNumber(final Integer number) {
        this.number = number;
        return this;
    }

    public Address withCity(final String city) {
        this.city = city;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
                Objects.equals(number, address.number) &&
                Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, city);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("street='").append(street).append('\'');
        sb.append(", number=").append(number);
        sb.append(", city='").append(city).append('\'');
        sb.append('}');
        return sb.toString();
    }
}