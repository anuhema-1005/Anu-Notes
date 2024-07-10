package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.anusreeCourse;
import com.examly.class_exercise_2.service.anusreeCourseService;

@RestController
public class anusreeCourseController {

     @Autowired
     public anusreeCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<anusreeCourse> postMethodName(@RequestBody anusreeCourse entity) {

          anusreeCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<anusreeCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<anusreeCourse>> getMethodName() {

          List<anusreeCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<anusreeCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<anusreeCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<anusreeCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}