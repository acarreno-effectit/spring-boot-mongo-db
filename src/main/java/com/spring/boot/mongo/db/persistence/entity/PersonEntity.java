package com.spring.boot.mongo.db.persistence.entity;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document("people")
public class PersonEntity {

  @Id
  private String id;

  private String firstName;

  private String secondName;

  private String lastName;

  private String secondLastName;

  private LocalDate birthDate;

  private String genre;

}
