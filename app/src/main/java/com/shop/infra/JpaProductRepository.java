package com.shop.infra;

import com.shop.domain.Product;
import com.shop.domain.ProductRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface JpaProductRepository
        extends ProductRepository, CrudRepository<Product, Long> {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    void delete(Product product);
}
