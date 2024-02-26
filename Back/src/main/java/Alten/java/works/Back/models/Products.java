package Alten.java.works.Back.models;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 
import org.springframework.data.annotation.Id; 
import org.springframework.data.mongodb.core.mapping.Document; 
import org.springframework.data.mongodb.core.mapping.Field; 


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class Products {
    
    
    @Id    
    private Integer id ;
    private String code;
    private String name;
    private String description;
    private Integer  price;
    private Integer quantity;
    private String inventoryStatus;
    private String category;
    private String image;
    private Integer rating;
}

