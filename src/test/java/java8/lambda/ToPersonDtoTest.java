package java8.lambda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("ToPersonDto should")
class ToPersonDtoTest {

    @Test
    @DisplayName("transform a person bean to its dto")
    void transformerFunction() {
        Person person = new Person(1, "ElMehdi");

        PersonDto personDto = new ToPersonDto().apply(person);

        assertThat(personDto.getName()).isEqualTo("ElMehdi");
    }

}