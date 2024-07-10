package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.Product;
import com.examly.springapp.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    anusreeProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<anusreeProduct> postMethod(@RequestBody anusreeProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<anusreeProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<anusreeProduct>> dndcjk() {
        List<anusreeProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<anusreeProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<anusreeProduct>> getbyid(@PathVariable String productCategory) {
        List<anusreeProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<anusreeProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<anusreeProduct>> getbdyid(@PathVariable String priceCategory) {
        List<anusreeProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<anusreeProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
