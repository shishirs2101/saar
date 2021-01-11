package com.saar.springecom.items.model;

public enum ProductType {
    CLOTHS(1),
    MAN(2),
    WOMEN(3),
    CHILD(4),
    ELECTRONIC(5),
    KITCHEN(6),
    CLEANING(7),
    GENERAL(8),
    WINTER(9),
    SUMMER(10),
    SPRING(11),
    RAINY(12),
    ALL_SEASON(13);

    private Integer productId;

    ProductType(Integer productId) {
        this.productId = productId;
    }

    public Integer getVal(){
        return productId;
    }
}
