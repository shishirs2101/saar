package com.saar.springecom.items.service.impl;

import com.saar.springecom.items.dao.ProductCategoryDao;
import com.saar.springecom.items.model.ProductCategory;
import com.saar.springecom.items.service.IProductCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Transactional
@Service
public class ProductCategoryImpl implements IProductCategory {
    
    @Autowired
    ProductCategoryDao productCategoryDao;


    @Override
    public ProductCategory save(ProductCategory userDetails) {
        return productCategoryDao.save(userDetails);
    }
    @Override
    public List<ProductCategory> saveAll(Iterable<ProductCategory> entities) {
        return productCategoryDao.saveAll(entities);
    }
    @Override
    public Optional<ProductCategory> findById(Integer id) {
        Optional<ProductCategory> byId = findById(id);
        return byId.isPresent()? Optional.empty() :byId;
    }
    @Override
    public boolean existsById(Integer id) {
        return productCategoryDao.existsById(id);
    }
    @Override
    public List<ProductCategory> findAll() {
        return productCategoryDao.findAll();
    }
    @Override
    public List<ProductCategory> findAllById(List<Integer> integers) {
        return productCategoryDao.findAllById(integers);
    }
    @Override
    public long count() {
        return productCategoryDao.count();
    }
    @Override
    public void deleteById(Integer integer) {
        productCategoryDao.deleteById(integer);
    }
    @Override
    public void delete(ProductCategory entity) {
        productCategoryDao.delete(entity);
    }
    @Override
    public void deleteAll(List<ProductCategory> userDetails) {
        productCategoryDao.deleteAll(userDetails);
    }
    @Override
    public void deleteAll() {
        productCategoryDao.deleteAll();
    }

}
