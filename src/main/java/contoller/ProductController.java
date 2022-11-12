package contoller;


import dto.OrderRequest;
import dto.OrderResponse;
import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.CategoryRepo;
import repository.ProductRepo;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/createProduct")
    public Product createProduct(@RequestBody OrderRequest request){
        return productRepo.save(request.getProduct());
    }

    @GetMapping("/findAllOrders")
    public List<Product> findAllOrders(){
        return productRepo.findAll();
    }

    @GetMapping("/categories")
    public List<Product> getAllCategories(){
        return  categoryRepo.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return productRepo.getJoinInformation();
    }

}
