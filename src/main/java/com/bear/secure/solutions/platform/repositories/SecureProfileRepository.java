package com.bear.secure.solutions.platform.repositories;

import com.bear.secure.solutions.platform.entities.SecureProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureProfileRepository extends MongoRepository<SecureProfile, String> {
}
