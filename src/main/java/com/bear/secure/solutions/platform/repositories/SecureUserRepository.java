package com.bear.secure.solutions.platform.repositories;

import com.bear.secure.solutions.platform.entities.SecureUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureUserRepository extends MongoRepository<SecureUser, String> {
}
