package com.example.anusreeday4cw2.anusreerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day4cw2.model.Job;

@Repository
public interface AnusreeJobRepo extends JpaRepository<Job,Integer>{
    
}
