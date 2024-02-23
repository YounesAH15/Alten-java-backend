package Alten.java.works.Back.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import Alten.java.works.Back.repositories.IProducts; 
import Alten.java.works.Back.models.Products;


@RestController
public class ProductsController {

    IProducts repo;

    @RequestMapping("/products")
    public String getAll() {
     return repo.findAll().toString();
    }

    @RequestMapping("/products/{id}")
    public String getOne(
         @PathVariable int id
    ) {
     return repo.findById(id).toString();
    }

    @PostMapping("/products")
    public void addOne(
        @RequestBody Products product 
    ) {
       repo.save(product);
    }


    @DeleteMapping("/products/{id}") 
    public String deleteOne (
        @PathVariable int id
    ){ 
        repo.deleteById(id); 
        return "Deleted Successfully"; 
    } 
}

