package com.spring.boot.mongo.db.controller;

import java.time.LocalDate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.boot.mongo.db.model.Person;
import com.spring.boot.mongo.db.service.BussinesLayer;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class WebController {

  private final BussinesLayer bussinesLayer;

  @PostMapping("/")
  public ResponseEntity<String> createPerson(@RequestBody Person person) {

    String idPerson = bussinesLayer.createPerson(person);

    return ResponseEntity.ok(idPerson);
  }

  @GetMapping("/{idPerson}")
  public ResponseEntity<Person> getPerson(@PathVariable("idPerson") String idPerson) {

    Person person = bussinesLayer.getPerson(idPerson);

    return ResponseEntity.ok(person);
  }

  @PatchMapping("/{idPerson}/{birthDate}")
  public ResponseEntity<Void> updateBirthDatePerson(@PathVariable("idPerson") String idPerson,
      @PathVariable("birthDate") LocalDate birthDate) {

    bussinesLayer.updateBirthDatePerson(idPerson, birthDate);

    return ResponseEntity.noContent().build();
  }

}
