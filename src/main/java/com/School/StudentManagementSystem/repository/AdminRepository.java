package com.School.StudentManagementSystem.repository;

import com.School.StudentManagementSystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Optional<Admin> findByEmail(String email);
}
