package com.spring.boot.mongo.db.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Person {

  private String firstName;

  private String secondName;

  private String lastName;

  private String secondLastName;

  private LocalDate birthDate;

  private String genre;

}
