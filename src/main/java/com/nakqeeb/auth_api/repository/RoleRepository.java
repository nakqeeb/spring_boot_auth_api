package com.nakqeeb.auth_api.repository;

import com.nakqeeb.auth_api.entity.Role;
import com.nakqeeb.auth_api.entity.RoleEnum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Optional<Role> findByName(RoleEnum name);
}