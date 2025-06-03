package com.practice.myapp.repository;

import com.practice.myapp.domain.Department;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Department entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {}
