package com.example.shop1.dto;

import jakarta.validation.constraints.Min;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;

/**
 * A DTO for the {@link com.example.shop1.entity.AdEntity} entity
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdsDTO {

  Integer author;
  String image;
  Integer pk;
  @NotNull
  @Min(value = 1)
  Integer price;
  @NotNull("Обязательно нужно заполнить поле")
  String title;
}