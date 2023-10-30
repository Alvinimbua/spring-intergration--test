package com.imbuka.springtestcontainers.repository;

import com.imbuka.springtestcontainers.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
