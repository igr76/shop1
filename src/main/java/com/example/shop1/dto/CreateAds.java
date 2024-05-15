package com.example.shop1.dto;


import jakarta.validation.constraints.Min;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateAds {

    /**
     * Описание продаваемого объекта
     */
    String description;

    /**
     * цена
     */
    @Min(1)
    Integer price;

    /**
     * Название
     */
    String title;


}
