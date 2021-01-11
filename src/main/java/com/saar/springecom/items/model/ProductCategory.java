package com.saar.springecom.items.model;

import javax.persistence.*;

@Entity
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "product_id")
    private Integer productTd;
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "type_id")
    private Integer typeId;


    public Integer getProductTd() {
        return productTd;
    }

    public void setProductTd(Integer productTd) {
        this.productTd = productTd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", productTd=" + productTd +
                ", parentId=" + parentId +
                ", typeId=" + typeId +
                '}';
    }
}
