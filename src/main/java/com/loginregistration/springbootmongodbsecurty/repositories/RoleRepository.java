package com.loginregistration.springbootmongodbsecurty.repositories;

import com.loginregistration.springbootmongodbsecurty.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role,String> {

    Role findByRole(String role);
}
