package za.co.squnga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.Product;
import za.co.squnga.repository.customs.CustomProductRepository;
@NoRepositoryBean
public interface ProductRepository extends JpaRepository<Product, Long> ,CustomProductRepository{
}
