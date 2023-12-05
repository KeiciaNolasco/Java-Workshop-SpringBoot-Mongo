package com.nolasco.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nolasco.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
