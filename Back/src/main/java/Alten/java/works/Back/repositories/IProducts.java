package Alten.java.works.Back.repositories;

import org.springframework.data.mongodb.repository.MongoRepository; 
import Alten.java.works.Back.models.Products;


public interface IProducts extends MongoRepository<Products , Integer> {
    
}