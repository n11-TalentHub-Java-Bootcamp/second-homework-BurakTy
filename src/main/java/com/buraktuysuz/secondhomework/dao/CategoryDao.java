package com.buraktuysuz.secondhomework.dao;


import com.buraktuysuz.secondhomework.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao extends CrudRepository<Category,Long> {
}
