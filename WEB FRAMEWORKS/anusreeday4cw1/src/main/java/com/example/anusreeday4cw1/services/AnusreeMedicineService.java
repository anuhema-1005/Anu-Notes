package com.example.anusreeday4cw1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.anusreeday4cw1.anusreemodel.AnusreeMedicine;
import com.example.anusreeday4cw1.anusreerepository.AnusreeMedicineRepo;
@Service
public class AnusreeMedicineService {
    public AnusreeMedicineRepo AnurseemedicineRepo;
    public AnusreeMedicineService(AnusreeMedicineRepo AnurseemedicineRepo)
    {
        this.AnurseemedicineRepo = AnurseemedicineRepo;
    }
    public boolean saveMedicine(AnusreeMedicine medicine)
    {
        try{
            AnurseemedicineRepo.save(medicine);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AnusreeMedicine> getMedicines()
    {
        return AnurseemedicineRepo.findAll();
    }

    public AnusreeMedicine MedicineById(int id)
    {
        Optional<AnusreeMedicine> obj = AnurseemedicineRepo.findById(id);
        return obj.orElse(new AnusreeMedicine());
    }

}
