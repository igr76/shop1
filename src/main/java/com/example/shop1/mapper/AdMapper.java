package com.example.shop1.mapper;


import com.example.shop1.dto.AdsDTO;
import com.example.shop1.entity.AdEntity;
import com.example.shop1.entity.ImageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * маппер для {@link com.example.shop1.entity.AdEntity} готовый DTO {@link com.example.shop1.dto.AdsDTO}
 */
@Mapper(componentModel = "spring")
public interface AdMapper {





  @Mapping(target = "author", ignore = true)
  @Mapping(target = "id", source = "pk")
  @Mapping(target = "description", constant = "Неполная реклама")
  @Mapping(target = "imageEntities", expression = "java(setImageEntities(adDto.getImage()))")
  AdEntity toEntity(AdsDTO adDto);



  @Mapping(target = "author", source = "author.id")
  @Mapping(target = "pk", source = "id")
  @Mapping(target = "image", expression = "java(setImage(adEntity.getImageEntities()))")
  AdsDTO toDTO(AdEntity adEntity);

  default String setImage(List<ImageEntity> imageEntities) {
    if (imageEntities == null || imageEntities.size() == 0) {
      return null;
    }
    return imageEntities.get(0).getPath();
  }

  default List<ImageEntity> setImageEntities(String path) {

    List<ImageEntity> imageEntities = new ArrayList<>();
      ImageEntity imageEntity = new ImageEntity();
      imageEntity.setPath(path);
      imageEntities.add(imageEntity);

    return imageEntities;
  }

  Collection<AdEntity> toEntityList(Collection<AdsDTO> adDTOS);

  Collection<AdsDTO> toDTOList(Collection<AdEntity> adEntities);
}
