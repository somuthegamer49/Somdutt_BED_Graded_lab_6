package com.glearning.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.lab6.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
