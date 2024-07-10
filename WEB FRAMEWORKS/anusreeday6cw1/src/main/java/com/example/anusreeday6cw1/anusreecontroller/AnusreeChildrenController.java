package com.example.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_1.model.AnusreeChildren;
import com.example.class_exercise_1.service.ChildrenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AnusreeChildrenController {

     @Autowired
     public ChildrenService childrenService;

     @GetMapping("/api/children/sortBy/{babyFirstName}")
     public ResponseEntity<List<AnusreeChildren>> sort(@PathVariable String babyFirstName) {
          List<AnusreeChildren> child = childrenService.sort(babyFirstName);

          if (child.isEmpty()) {

               return new ResponseEntity<>(child, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(child, HttpStatus.OK);

     }

     // Pagination
     @GetMapping("api/children/{offset}/{pagesize}")
     public ResponseEntity<List<AnusreeChildren>> pagination(@PathVariable int offset, @PathVariable int pagesize) {
          List<AnusreeChildren> pages = childrenService.pagination(offset, pagesize);
          if (pages.isEmpty()) {
               return new ResponseEntity<List<AnusreeChildren>>(pages, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AnusreeChildren>>(pages, HttpStatus.OK);
     }

     @GetMapping("/api/children/{offset}/{pagesize}/{field}")
     public ResponseEntity<List<AnusreeChildren>> sortedPage(@PathVariable int offset, @PathVariable int pagesize,
               @PathVariable String field) {
          List<AnusreeChildren> sortedPage = childrenService.sortedPage(offset, pagesize, field);
          if (sortedPage.isEmpty()) {

               return new ResponseEntity<>(sortedPage, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(sortedPage, HttpStatus.OK);
     }

     @PostMapping("/api/children")
     public ResponseEntity<AnusreeChildren> postDetails(@RequestBody AnusreeChildren children) {

          return new ResponseEntity<AnusreeChildren>(childrenService.save(children), HttpStatus.CREATED);
     }

}