package com.luyalukhele.WhatUPlayin.repository;

import com.luyalukhele.WhatUPlayin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
