package Alten.java.works.Back.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import Alten.java.works.Back.repositories.IProducts; 
import Alten.java.works.Back.models.Products;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.List;
import java.util.Optional;


@RestController
public class ProductsController {

    @Autowired 
    IProducts repo;

    @PostMapping("/")
    public String load(@RequestBody List<Products> ps ) {
         repo.saveAll(ps);
        return "loaded content db";
    }

    @GetMapping("/products")
    public List<Products> getAll() {
    
     return repo.findAll();      
    }

    @RequestMapping("/products/{id}")
    public Optional<Products> getOne(
         @PathVariable Integer id 
    ) {
     return repo.findById(id);
    }

    @PostMapping("/products/")
    public void addOne(
        @RequestBody Products product 
    ) {
       repo.save(product);
    }

    @PatchMapping("/products/{id}")
    public String editOne(@RequestBody Products p)
    {
        repo.save(p);
        return "updated product with id "+p.id;
    }

    @DeleteMapping("/products/{id}") 
    public String deleteOne (
        @PathVariable Integer  id
    ){ 
        repo.deleteById(id); 
        return "Deleted Successfully"; 
    } 
}

