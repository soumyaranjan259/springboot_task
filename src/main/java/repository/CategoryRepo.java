package repository;

import dto.OrderResponse;
import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Product,Integer> {

    List<OrderResponse> getJoinInformation();
}
