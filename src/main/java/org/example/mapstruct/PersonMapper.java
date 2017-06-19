package org.example.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = { AddressMapper.class })
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    Person fromDto(PersonDTO personDTO);
    PersonDTO toDto(Person person);

}
