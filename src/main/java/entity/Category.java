package entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Category {

    @Id
    private int id;
    private String name;
    private String desc;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Product> products;


}
