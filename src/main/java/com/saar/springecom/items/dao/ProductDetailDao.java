package com.saar.springecom.items.dao;

import com.saar.springecom.items.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailDao extends JpaRepository<ProductDetail,Integer> {
}
