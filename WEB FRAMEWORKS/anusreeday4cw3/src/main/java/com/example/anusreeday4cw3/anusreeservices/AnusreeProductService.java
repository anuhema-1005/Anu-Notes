package com.example.day4cw3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw3.model.Product;
import com.example.day4cw3.repository.ProductRepo;

@Service
public class AnusreeProductService {
    public AnusreeProductRepo productRepo;
    public AnusreeProductService(AnusreeProductRepo productRepo)
    {
        this.productRepo=productRepo;
    }
    public boolean saveProduct(AnusreeProduct product)
    {
        try{
            productRepo.save(product);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AnusreeProduct> getProducts()
    {
        return productRepo.findAll();
    }
    public AnusreeProduct getProductById(int id)
    {
        Optional<AnusreeProduct> obj = productRepo.findById(id);
        return obj.orElse(new AnusreeProduct());
    }
}
