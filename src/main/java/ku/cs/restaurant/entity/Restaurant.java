package ku.cs.restaurant.entity;

//ตะเอาข้อมูลไปสร้างตารางอัตโนมัติเลย

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;
import lombok.ToString;

import java.util.UUID;

@Data  //จะ get set ให้โดยอัตโนมัตื
//@ToString จะ to string ให้อัตโนมัต
@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private UUID id ;

    private String name;
    private double rating;
    private String location;


}
