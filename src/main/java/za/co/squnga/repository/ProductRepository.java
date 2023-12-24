package za.co.squnga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.squnga.entity.Product;
import za.co.squnga.repository.custom.CustomProductRepository;

public interface ProductRepository extends JpaRepository<Product, Long> ,CustomProductRepository{
}
