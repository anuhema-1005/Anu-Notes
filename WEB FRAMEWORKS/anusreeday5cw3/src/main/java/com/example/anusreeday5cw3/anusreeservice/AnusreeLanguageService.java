package com.example.day5cw3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.model.AnusreeLanguage;
import com.example.day5cw3.repository.AnusreeLanguageRepo;

@Service
public class AnusreeLanguageService {
    private AnusreeLanguageRepo languageRepo;
    public AnusreeLanguageService(AnusreeLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(AnusreeLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AnusreeLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,AnusreeLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public AnusreeLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
