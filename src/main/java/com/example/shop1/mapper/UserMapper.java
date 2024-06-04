package com.example.shop1.mapper;


import com.example.shop1.dto.UserDTO;
import com.example.shop1.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collection;

/**
 * маппер для {@link com.example.shop1.entity.UserEntity} готовый dto {@link com.example.shop1.dto.UserDTO}
 */

@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mapping(target = "regDate", source = "regDate", dateFormat = "dd-MM-yyyy HH:mm:ss")
  @Mapping(target = "adEntities", ignore = true)
  @Mapping(target = "commentEntities", ignore = true)
  UserEntity toEntity(UserDTO userDto);

  @Mapping(target = "regDate", source = "regDate", dateFormat = "dd-MM-yyyy HH:mm:ss")
  UserDTO toDTO(UserEntity userEntity);

  Collection<UserEntity> toEntityList(Collection<UserDTO> userDTOS);

  Collection<UserDTO> toDTOList(Collection<UserEntity> userEntities);
}
