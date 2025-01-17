package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	Role findByname(String name);
}
