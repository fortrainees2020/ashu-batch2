package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService implements IProductService {
    private static final Logger logger =
            LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository productRepo;

	@Override
	public List<ProductDTO> getProductsFromDatabase() {
		logger.info("Fetching all products");
        return productRepo.findAll()
                .stream()
                .map(ProductDTO::toDTO)
                .collect(Collectors.toList());	
	}

	@Override
	public ProductDTO getProductById(Integer id) throws ResourceNotFoundException {
		Product product = productRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Product not found with id: " + id));

        return ProductDTO.toDTO(product);
	}
	
	@Transactional
	@Override
	public ProductDTO createProduct(ProductDTO dto) {
		dto.setId(null);

        Product savedProduct = productRepo.save(ProductDTO.fromDTO(dto));

        return ProductDTO.toDTO(savedProduct);
	}

	@Transactional
	@Override
	public ProductDTO updateProduct(Integer productId, ProductDTO dto) throws ResourceNotFoundException {
		 Product existingProduct = productRepo.findById(productId)
	                .orElseThrow(() ->
	                        new ResourceNotFoundException(
	                                "Product not available: " + productId));

	        existingProduct.setPname(dto.getPname());
	        existingProduct.setPrice(dto.getPrice());

	        Product updatedProduct =
	                productRepo.save(existingProduct);

	        return ProductDTO.toDTO(updatedProduct);
	}

	@Override
	@Transactional
/*Without it :
-Product fetched
-Delete fails halfway
-DB may become inconsistent
With it :
-Either delete fully succeeds
Or nothing changes
* */
	//This entire delete operation runs inside a database transaction.
	public Map<String, Boolean> deleteProduct(Integer productId) throws ResourceNotFoundException {
		Product product = productRepo.findById(productId)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Product not available: " + productId));

        productRepo.delete(product);

        Map<String, Boolean> response = new HashMap<>();
        response.put("Product deleted successfully", Boolean.TRUE);
        return response;
	}

	/*@Override
	public ProductDTO getProductByName(String pname) throws ResourceNotFoundException {
		Product product = productRepo.findByPname(pname)
	            .orElseThrow(() ->
	                    new ResourceNotFoundException("Product not found with name: " + pname));

	    return ProductDTO.toDTO(product);
	}*/
	
	

	@Override
	public List<ProductDTO> getProductsByName(String pname) throws ResourceNotFoundException {
		 List<Product> products = productRepo.findAllByPname(pname);

		    if (products.isEmpty()) {
		        throw new ResourceNotFoundException(
		                "No products found with name: " + pname);
		    }

		    return products.stream()
		            .map(ProductDTO::toDTO)
		            .collect(Collectors.toList());
		}
	
	@Override
	public Long countProductsByName(String pname) {
		return productRepo.countByProductName(pname);
	}


	@Override
	public ProductDTO getProductByName(String pname) throws ResourceNotFoundException {
		return null;
	}
//----------------Pagination--------------------------
	@Override
    public Page<ProductDTO> getProductsByNameUsingPage (String pname, Pageable pageable) {
		return productRepo
				.findByPname(pname, pageable)
                .map(ProductDTO::toDTO);
    }
} 
