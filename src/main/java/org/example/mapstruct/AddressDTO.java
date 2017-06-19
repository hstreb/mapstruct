package org.example.mapstruct;

import java.util.Objects;

public class AddressDTO {
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

    public AddressDTO withStreet(final String street) {
        this.street = street;
        return this;
    }

    public AddressDTO withNumber(final Integer number) {
        this.number = number;
        return this;
    }

    public AddressDTO withCity(final String city) {
        this.city = city;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDTO address = (AddressDTO) o;
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
        final StringBuilder sb = new StringBuilder("AddressDTO{");
        sb.append("street='").append(street).append('\'');
        sb.append(", number=").append(number);
        sb.append(", city='").append(city).append('\'');
        sb.append('}');
        return sb.toString();
    }
}