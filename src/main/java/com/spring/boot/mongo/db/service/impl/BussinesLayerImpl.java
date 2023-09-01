package com.spring.boot.mongo.db.service.impl;

import java.time.LocalDate;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.spring.boot.mongo.db.model.Person;
import com.spring.boot.mongo.db.persistence.entity.PersonEntity;
import com.spring.boot.mongo.db.persistence.repository.PersonRepository;
import com.spring.boot.mongo.db.service.BussinesLayer;
import com.spring.boot.mongo.db.util.Mapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BussinesLayerImpl implements BussinesLayer {

  private final PersonRepository personRepository;
  private final Mapper mapper;

  @Override
  public String createPerson(Person person) {

    PersonEntity document = mapper.toPersonDocument(person);

    UUID uuid = UUID.randomUUID();
    document.setId(uuid.toString());

    personRepository.save(document);

    return document.getId();
  }

  @Override
  public Person getPerson(String idPerson) {

    PersonEntity document = personRepository.findById(idPerson).get();

    return mapper.toPerson(document);
  }

  @Override
  public void updateBirthDatePerson(String idPerson, LocalDate birthDate) {

    PersonEntity document = personRepository.findById(idPerson).get();

    document.setBirthDate(birthDate);

    personRepository.save(document);

  }

}
