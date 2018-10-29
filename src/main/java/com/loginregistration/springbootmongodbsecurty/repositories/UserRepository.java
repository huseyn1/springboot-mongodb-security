package com.loginregistration.springbootmongodbsecurty.repositories;

import com.loginregistration.springbootmongodbsecurty.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

    User findByEmail(String email);
}
