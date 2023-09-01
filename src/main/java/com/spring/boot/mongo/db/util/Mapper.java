package com.spring.boot.mongo.db.util;

import org.springframework.stereotype.Component;
import com.spring.boot.mongo.db.model.Person;
import com.spring.boot.mongo.db.persistence.entity.PersonEntity;

@Component
public class Mapper {

  public PersonEntity toPersonDocument(Person input) {

    PersonEntity output = new PersonEntity();

    output.setFirstName(input.getFirstName());
    output.setSecondName(input.getSecondName());
    output.setLastName(input.getLastName());
    output.setSecondLastName(input.getSecondLastName());
    output.setBirthDate(input.getBirthDate());
    output.setGenre(input.getGenre());

    return output;
  }

  public Person toPerson(PersonEntity input) {

    Person output = new Person();

    output.setFirstName(input.getFirstName());
    output.setSecondName(input.getSecondName());
    output.setLastName(input.getLastName());
    output.setSecondLastName(input.getSecondLastName());
    output.setBirthDate(input.getBirthDate());
    output.setGenre(input.getGenre());

    return output;
  }

}
