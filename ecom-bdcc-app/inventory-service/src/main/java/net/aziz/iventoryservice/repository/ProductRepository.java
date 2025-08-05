package net.aziz.iventoryservice.repository;
import net.aziz.iventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,String> {

}
