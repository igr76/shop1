package com.example.shop1.mapper;

import com.example.shop1.dto.ImageDTO;
import com.example.shop1.entity.ImageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * маппер для {@link com.example.shop1.entity.ImageEntity} готовый DTO {@link com.example.shop1.dto.ImageDTO}
 */
@Mapper(componentModel = "spring")
public interface ImageMapper {
  @Mapping(target = "path", source = "image")
  ImageEntity toEntity(ImageDTO imageDTO);
  @Mapping(target = "image", source = "path")
  ImageDTO toDTO(ImageEntity imageEntity);

}
