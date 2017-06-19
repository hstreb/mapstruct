package org.example.mapstruct;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.mapstruct.helper.PersonHelper.*;

@RunWith(JUnitParamsRunner.class)
public class PersonMapperTest {

    public static final LocalDate NOW = LocalDate.now();

    @Test
    @Parameters(method = "values")
    public void shouldMapFromDTOAndToDTO(final Person person, final PersonDTO personDTO) {
        assertThat(PersonMapper.INSTANCE.fromDto(personDTO)).isEqualTo(person);
        assertThat(PersonMapper.INSTANCE.toDto(person)).isEqualTo(personDTO);
    }

    private Object values() {
        return new Object[][] {
                { null, null },
                { buildPerson(), buildPersonDTO() }
        };
    }
}