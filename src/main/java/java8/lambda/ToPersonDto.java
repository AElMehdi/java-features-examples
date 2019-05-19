package java8.lambda;

import java.util.function.Function;

public class ToPersonDto implements Function<Person, PersonDto> {

    public PersonDto apply(Person person) {
        PersonDto personDto = new PersonDto();

        personDto.setId(person.getId());
        personDto.setName(person.getName());

        return personDto;
    }
}
