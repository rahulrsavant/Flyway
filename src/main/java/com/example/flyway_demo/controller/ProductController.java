package com.example.flyway_demo.controller;



import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flyway_demo.dto.ProductDTO;
import com.example.flyway_demo.entity.Product;
import com.example.flyway_demo.service.ProductService;

@RestController
public class ProductController {
	
	
	private ProductService service;
	


    public ProductController(ProductService service) {
		super();
		this.service = service;
	}

	@PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public ProductDTO findProductByName(@PathVariable String name) {
        
        ProductDTO productDTO=service.getProductByName(name);
        return productDTO;
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
    
    

}
