package com.example.anusreeday4cw1.anusreecontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.anusreeday4cw1.anusreemodel.AnusreeMedicine;
import com.example.anusreeday4cw1.services.AnusreeMedicineService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AnusreeMedicineController {

    private AnusreeMedicineService medicineService;

    public AnusreeMedicineController(AnusreeMedicineService medicineService)
    {
        this.medicineService = medicineService;
    }
    @PostMapping("/api/medicine")
    public ResponseEntity<AnusreeMedicine> postMethodName(@RequestBody AnusreeMedicine medicine) { 
        if(medicineService.saveMedicine(medicine)==false)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(medicine,HttpStatus.CREATED);
    }

    @GetMapping("/api/medicines")
    public ResponseEntity<List<AnusreeMedicine>> getMethodName() {
        List<AnusreeMedicine> list = medicineService.getMedicines();
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
    @GetMapping("/api/medicine/{medicineId}")
    public ResponseEntity<AnusreeMedicine> getMedicineById(@PathVariable("medicineId") int id) {
        AnusreeMedicine m =  medicineService.MedicineById(id);
        if(m==null)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(m,HttpStatus.OK);
    }
    
    
}
