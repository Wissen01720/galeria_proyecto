// RolesRepository.java
package com.usta.gallery.repository;

import com.usta.gallery.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Roles, Long> {
}