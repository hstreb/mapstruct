package org.example.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address fromDto(AddressDTO addressDTO);
    AddressDTO toDto(Address address);

}
