package repository;

import dto.OrderResponse;
import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Query("SELECT new com.CrudProj.app.dto.OrderResponse(c.name , p.productName) FROM Category c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();


}
