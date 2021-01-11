package com.saar.springecom.items.model;

import javax.persistence.*;

@Entity
@Table(name = "product_detail")
public class ProductDetail {

    @Id
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_desc")
    private String productDesc;
    @Column(name = "cost")
    private Double cost;
    @Column(name = "product_name")
    private String productName;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductDetail{" +
                "productId=" + productId +
                ", productDesc='" + productDesc + '\'' +
                ", cost=" + cost +
                ", productName='" + productName + '\'' +
                '}';
    }
}
