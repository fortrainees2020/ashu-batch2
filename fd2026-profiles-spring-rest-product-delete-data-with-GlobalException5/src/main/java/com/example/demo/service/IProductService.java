package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.example.demo.dto.ProductDTO;
import com.example.demo.exception.ResourceNotFoundException;

public interface IProductService {

    List<ProductDTO> getProductsFromDatabase();

    ProductDTO getProductById(Integer id) throws ResourceNotFoundException;

    ProductDTO createProduct(ProductDTO productDTO);

    ProductDTO updateProduct(Integer productId, ProductDTO productDTO) throws ResourceNotFoundException;

    Map<String, Boolean> deleteProduct(Integer productId) throws ResourceNotFoundException;

    ProductDTO getProductByName(String pname) throws ResourceNotFoundException;

    List<ProductDTO> getProductsByName(String pname)throws ResourceNotFoundException;

    Long countProductsByName(String pname);
    
    
    //Added for pagination
    Page<ProductDTO> getProductsByNameUsingPage(String pname, Pageable pageable);
    
}
