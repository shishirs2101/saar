package com.saar.springecom.items.dao;

import com.saar.springecom.items.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {
}
