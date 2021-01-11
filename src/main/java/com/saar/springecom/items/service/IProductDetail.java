package com.saar.springecom.items.service;



import com.saar.springecom.items.model.ProductDetail;

import java.util.List;
import java.util.Optional;

public interface IProductDetail {
    public ProductDetail save(ProductDetail productDetail);
    public List<ProductDetail> saveAll(Iterable<ProductDetail> entities);
    public Optional<ProductDetail> findById(Integer id);
    public boolean existsById(Integer id);
    public List<ProductDetail> findAll();
    public List<ProductDetail> findAllById(List<Integer> ids);
    public long count();
    public void deleteById(Integer productId);
    public void delete(ProductDetail entity);
    public void deleteAll(List<ProductDetail> productDetails);
    public void deleteAll();
}
