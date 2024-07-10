package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.Product;
import com.example.day5cw1.repository.ProductRepo;

@Service
public class AnusreeProductService {
    public anusreeProductRepo productRepo;
    public AnusreeProductService(anusreeProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(anusreeProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,anusreeProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public anusreeProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
