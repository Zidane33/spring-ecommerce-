package com.Backend.Zidane.Store.App.Controllers;

import java.util.List;

import com.Backend.Zidane.Store.App.Model.Product;
import com.Backend.Zidane.Store.App.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @CrossOrigin(origins = "http://zidane-store-react-bucket.s3-website-us-east-1.amazonaws.com")
    @GetMapping
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }
}
