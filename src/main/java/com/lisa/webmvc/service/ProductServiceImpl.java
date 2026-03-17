package com.lisa.webmvc.service;


import com.lisa.webmvc.domain.Category;
import com.lisa.webmvc.domain.Product;
import com.lisa.webmvc.dto.CreateProductRequest;
import com.lisa.webmvc.dto.ProductResponse;
import com.lisa.webmvc.repository.CategoryRepository;
import com.lisa.webmvc.repository.ProductRepository;
import com.lisa.webmvc.util.GenerateUtil;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ProductResponse createNewProduct(CreateProductRequest createProductRequest) {
        //todo:write logic to create a new product
        //1.Validate category ID(exits or not)

        Category category = categoryRepository
                .findById(createProductRequest.categoryId())
                .orElseThrow(() -> new RuntimeException("Category ID doesn't exist"));

        log.info("category:{}", category.getId());
        //transfer data from DTO to entity
        Product product= new Product();
        product.setCategory(category);
        product.setName(createProductRequest.name());
        product.setPrice(createProductRequest.price());

        //3.set system data
        product.setStatus(true);
        product.setCode(GenerateUtil.generateProductCode());
        //4.transfer date from entity to DTO
        product= productRepository.save(product);

        //5.Transfer data from Entity to DTO
        return ProductResponse.builder()
                .code(product.getCode())
                .name(product.getName())
                .price(product.getPrice())
                .status(product.getStatus())
                .categoryName(product.getCategory().getName())
                .build();


    }

}

