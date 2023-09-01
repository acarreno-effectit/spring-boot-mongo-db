package com.spring.boot.mongo.db.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.spring.boot.mongo.db.persistence.entity.PersonEntity;

public interface PersonRepository extends MongoRepository<PersonEntity, String> {

}
