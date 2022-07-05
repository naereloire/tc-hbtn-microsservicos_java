package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> list = new ArrayList<>();

    public List<Product> getAllProducts() {
        return list;
    }

    public Product getProductById(Integer id) {
        return list.stream().filter(product -> product.getId().equals(id)).findAny().orElse(null);
    }

    public void addProduct(Product s) {
        if (!list.contains(s)) {
            list.add(s);
        }
    }

    public void updateProduct(Product s) {
        Product productId = getProductById(Math.toIntExact(s.getId()));
        if (list.contains(s)) {
            int index = list.indexOf(productId);
            list.set(index, s);
        }
    }

    public void removeProduct(Product s) {
        Product productId = getProductById(Math.toIntExact(s.getId()));
        if (list.contains(s)) {
            list.remove(productId);
        }
    }

    public void addList(List<Product> listOfProducts) {
        List<List<Product>> newlist = new ArrayList<>();
        if (!newlist.contains(listOfProducts)) {
            newlist.add(listOfProducts);
        }
    }
}