package com.example.shop1.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * DTO  для {@link com.example.shop1.entity.ImageEntity} картинки
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ImageDTO {

    String image;



}
