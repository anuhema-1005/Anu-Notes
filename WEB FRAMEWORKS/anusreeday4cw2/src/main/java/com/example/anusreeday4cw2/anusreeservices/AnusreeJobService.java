package com.example.anusreeday4cw2.anusreeservices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw2.model.Job;
import com.example.day4cw2.repository.JobRepo;

@Service
public class AnusreeJobService {
    public JobRepo jobRepo;
    public AnusreeJobService(JobRepo jobRepo)
    {
        this.jobRepo = jobRepo;
    }
    public boolean saveJob(Job job)
    {
        try{
            jobRepo.save(job);
        } 
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Job> getJobs()
    {
        return jobRepo.findAll();
    }
    public Job getJobById(int id)
    {
        Optional<Job> obj = jobRepo.findById(id);
        return obj.orElse(null);
    }
}
