package com.spring.boot.mongo.db.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.RequiredArgsConstructor;

// @Configuration
// @RequiredArgsConstructor
public class MongoDBConfig {

  // ------------------
  // Private Attributes
  // ------------------

  //  private final Environment env;

  // --------------
  // Public Methods
  // --------------

  // @Bean
  // MongoTemplate mongoTemplate() {
  // MongoTemplate mongoTemplate = new MongoTemplate(mongoClient(), databaseName());
  // return mongoTemplate;
  // }

  // ---------------
  // Private Methods
  // ---------------

  // private MongoClient mongoClient() {
  //
  // StringBuilder connectionUrl = new StringBuilder();
  // connectionUrl.append("mongodb://");
  // connectionUrl.append(env.getProperty("spring.data.mongodb.username"));
  // connectionUrl.append(":");
  // connectionUrl.append(env.getProperty("spring.data.mongodb.password"));
  // connectionUrl.append("@");
  // connectionUrl.append(env.getProperty("spring.data.mongodb.host"));
  // connectionUrl.append(":");
  // connectionUrl.append(env.getProperty("spring.data.mongodb.port"));
  // connectionUrl.append("/");
  // connectionUrl.append(env.getProperty("spring.data.mongodb.database"));
  //
  // MongoClient mClient = MongoClients.create(connectionUrl.toString());
  // return mClient;
  // }
  //
  // private String databaseName() {
  // return env.getProperty("spring.data.mongodb.database");
  // }

}
