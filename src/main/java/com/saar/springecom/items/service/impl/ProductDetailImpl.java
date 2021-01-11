package com.saar.springecom.items.service.impl;

import com.saar.springecom.items.dao.ProductDetailDao;
import com.saar.springecom.items.model.ProductDetail;
import com.saar.springecom.items.service.IProductDetail;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Entity
@Transactional
public class ProductDetailImpl  implements IProductDetail {
    
    @Autowired
    ProductDetailDao productDetailDao;

    @Override
    public ProductDetail save(ProductDetail userDetails) {
        return productDetailDao.save(userDetails);
    }
    @Override
    public List<ProductDetail> saveAll(Iterable<ProductDetail> entities) {
        return productDetailDao.saveAll(entities);
    }
    @Override
    public Optional<ProductDetail> findById(Integer id) {
        Optional<ProductDetail> byId = findById(id);
        return byId.isPresent()? Optional.empty() :byId;
    }
    @Override
    public boolean existsById(Integer id) {
        return productDetailDao.existsById(id);
    }
    @Override
    public List<ProductDetail> findAll() {
        return productDetailDao.findAll();
    }
    @Override
    public List<ProductDetail> findAllById(List<Integer> integers) {
        return productDetailDao.findAllById(integers);
    }
    @Override
    public long count() {
        return productDetailDao.count();
    }
    @Override
    public void deleteById(Integer integer) {
        productDetailDao.deleteById(integer);
    }
    @Override
    public void delete(ProductDetail entity) {
        productDetailDao.delete(entity);
    }
    @Override
    public void deleteAll(List<ProductDetail> userDetails) {
        productDetailDao.deleteAll(userDetails);
    }
    @Override
    public void deleteAll() {
        productDetailDao.deleteAll();
    }
    
    
}
