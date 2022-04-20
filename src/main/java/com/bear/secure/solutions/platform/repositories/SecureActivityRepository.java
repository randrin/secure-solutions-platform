package com.bear.secure.solutions.platform.repositories;

import com.bear.secure.solutions.platform.entities.SecureActivity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureActivityRepository extends MongoRepository<SecureActivity, String> {
}
