package org.example.repository;

import org.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 16339
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
