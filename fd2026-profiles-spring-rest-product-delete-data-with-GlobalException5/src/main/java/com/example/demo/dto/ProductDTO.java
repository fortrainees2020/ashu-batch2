package com.example.demo.dto;

import com.example.demo.entity.Product;

public class ProductDTO {

    private Integer id;
    private String pname;
    private Double price;

    public ProductDTO() {
    }

    public ProductDTO(Integer id, String pname, Double price) {
        this.id = id;
        this.pname = pname;
        this.price = price;
    }

    /* ---------- Entity → DTO ---------- */
    public static ProductDTO toDTO(Product product) {
        if (product == null) {
            return null;
        }
        return new ProductDTO(
                product.getId(),
                product.getPname(),
                product.getPrice()
        );
    }

    /* ---------- DTO → Entity ---------- */
    public static Product fromDTO(ProductDTO dto) {
        if (dto == null) {
            return null;
        }
        Product product = new Product();
        product.setId(dto.getId());   // useful for update
        product.setPname(dto.getPname());
        product.setPrice(dto.getPrice());
        return product;
    }

    /* ---------- Getters & Setters ---------- */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
