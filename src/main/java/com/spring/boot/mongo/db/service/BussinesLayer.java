package com.spring.boot.mongo.db.service;

import java.time.LocalDate;
import com.spring.boot.mongo.db.model.Person;

public interface BussinesLayer {

  String createPerson(Person person);

  Person getPerson(String idPerson);

  void updateBirthDatePerson(String idPerson, LocalDate birthDate);

}
