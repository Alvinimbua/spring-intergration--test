package com.imbuka.springtestcontainers.service;


import com.imbuka.springtestcontainers.entity.Course;
import com.imbuka.springtestcontainers.repository.CourseRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CourseService {
    private CourseRepository courseRepository;

    public Course addNewCourse(Course course) {
        log.info("CourseService::addNewCourse method executed");
        return courseRepository.save(course);
    }

    public List<Course> getAllAvailableCourses() {
        log.info("CourseService::getAllAvailableCourses method executed");
        return courseRepository.findAll();
    }
}
