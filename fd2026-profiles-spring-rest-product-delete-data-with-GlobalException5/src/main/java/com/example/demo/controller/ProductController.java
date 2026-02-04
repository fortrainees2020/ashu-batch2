package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.ProductDTO;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.service.IProductService;
import com.example.demo.service.ProductService;

import jakarta.validation.Valid;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProductController {

	//“Constructor injection is preferred because it enforces immutability and makes dependencies explicit.”
	private final IProductService productService;
	
	@Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }
	
    @GetMapping("/products")
    public List<ProductDTO> getAllProducts() {
        return productService.getProductsFromDatabase();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDTO> getProductById(  @PathVariable int id)
            throws ResourceNotFoundException {

        return ResponseEntity.ok(
                productService.getProductById(id));
    }

    @PostMapping("/products")
    public ResponseEntity<ProductDTO> createProduct(
            @Valid @RequestBody ProductDTO productDTO) {

        return ResponseEntity.ok(
                productService.createProduct(productDTO));
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<ProductDTO> updateProduct(
            @PathVariable Integer id,
            @Valid @RequestBody ProductDTO productDTO)
            throws ResourceNotFoundException {

        ProductDTO updated =
                productService.updateProduct(id, productDTO);

        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/products/{id}")
    public Map<String, Boolean> deleteProduct(
            @PathVariable Integer id)
            throws ResourceNotFoundException {

        return productService.deleteProduct(id);
    }

    @GetMapping("/products/name/{pname}")
    public ResponseEntity<ProductDTO> getProductByName(
            @PathVariable String pname)
            throws ResourceNotFoundException {

        return ResponseEntity.ok(
                productService.getProductByName(pname));
    }

    
    //@Query
    @GetMapping("/products/count/{pname}")
    public ResponseEntity<Long> countProductsByName(
            @PathVariable String pname) {
        return ResponseEntity.ok(
                productService.countProductsByName(pname));
    }
  //Derived Query
    @GetMapping("/products/names/{pname}")
    public ResponseEntity<List<ProductDTO>> getProductsByName(
            @PathVariable String pname)
            throws ResourceNotFoundException {

        return ResponseEntity.ok(
                productService.getProductsByName(pname));
    }
   // ---------------Pagination---------------------
    //http://localhost:9091/api/productpage/names/marker?page=0&size=1
    //http://localhost:9091/api/productpage/names/marker?page=0&size=2&sort=price,desc
    @GetMapping("/productpage/names/{pname}")
    public List<ProductDTO> findProductsByNameUsingPage(
            @PathVariable String pname,
            Pageable pageable) {

        return productService
                .getProductsByNameUsingPage(pname, pageable)
                .getContent();
    }
}
