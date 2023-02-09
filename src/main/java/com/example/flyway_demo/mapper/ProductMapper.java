package com.example.flyway_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.flyway_demo.dto.ProductDTO;
import com.example.flyway_demo.entity.Product;



@Mapper(componentModel = "spring")
public interface ProductMapper {
  
	ProductMapper MAPPER=Mappers.getMapper(ProductMapper.class);
	
	@Mapping(target="productName",source="name")
	ProductDTO getModelFromEntity(Product product);
	
	@Mapping(target="name",source="productName")
	Product getEntityFromModel(ProductDTO product);
}
