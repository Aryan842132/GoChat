package com.gochat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.gochat.repository")
@EnableMongoAuditing
public class MongoConfig {
    // MongoDB configuration is handled via application.properties
    // This class can be extended for custom configurations if needed
}
