package com.saar.springecom.items.service;

import com.saar.springecom.items.model.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface IProductCategory {

    public ProductCategory save(ProductCategory productCategory);
    public List<ProductCategory> saveAll(Iterable<ProductCategory> entities);
    public Optional<ProductCategory> findById(Integer id);
    public boolean existsById(Integer id);
    public List<ProductCategory> findAll();
    public List<ProductCategory> findAllById(List<Integer> ids);
    public long count();
    public void deleteById(Integer productId);
    public void delete(ProductCategory entity);
    public void deleteAll(List<ProductCategory> productCategories);
    public void deleteAll();
}
