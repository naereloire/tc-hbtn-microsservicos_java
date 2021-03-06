package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @ApiOperation(value = "BEM VINDO À PRODUCT REST API.")
    @GetMapping("/welcome")
    @Autowired
    private String mensagemBoasVindas() {
        return "Bem vindo!";
    }

    @ApiOperation(value = "Responsável por adicionar um produto.")
    @PostMapping(path = "/addProduct", consumes = "application/json", produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 10, message = "Required fields not informed.")})
    public Product addProduct(@RequestBody Product product) {
        productRepository.addProduct(product);
        return product;
    }

    @ApiOperation(value = "Responsável por retornar uma lista de produtos.")
    @GetMapping(path = "/allProducts", consumes = "application/json", produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 11, message = "Warning - the process returned more than 1000 products.")})
    public List<Product> allProducts() {
        return productRepository.getAllProducts();
    }

    @ApiOperation(value = "Responsável por retornar um produto pelo id.")
    @GetMapping(path = "/findProductById/{id}")
    @ApiResponses(value = {@ApiResponse(code = 12, message = "The field id not informed. This information is required.")})
    public Product findProductById(@PathVariable Long id) {
        return productRepository.getProductById(id);
    }

    @ApiOperation(value = "Responsável por remover um produto.")
    @DeleteMapping(path = "/removeProduct", consumes = "application/json", produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 13, message = "User not allowed to remove a product from this category.")})
    public void removeProduct(@RequestBody Product product) {
        productRepository.removeProduct(product);
    }

    @ApiOperation(value = "Responsável por atualizar um produto.")
    @PutMapping(path = "/updateProduct", consumes = "application/json", produces = "application/json")
    @ApiResponses(value = {@ApiResponse(code = 14, message = "No information has been updated. The new information is the same as recorded in the database.")})
    public Product updateProduct(@RequestBody Product product) {
        productRepository.updateProduct(product);
        return product;
    }

}
