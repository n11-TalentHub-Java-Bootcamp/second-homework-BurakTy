package com.buraktuysuz.secondhomework.dao;

import com.buraktuysuz.secondhomework.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<Product,Long> {
}

