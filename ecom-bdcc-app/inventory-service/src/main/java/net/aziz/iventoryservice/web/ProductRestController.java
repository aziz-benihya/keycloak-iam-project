package net.aziz.iventoryservice.web;

import net.aziz.iventoryservice.entities.Product;
import net.aziz.iventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")

public class ProductRestController {
    private  ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/products")
    public  List<Product> productList(){
        return productRepository.findAll();

    }
    @GetMapping("/products/{id}")
    public Product productById(@PathVariable String id ){
        return productRepository.findById(id).get();

    }
}
