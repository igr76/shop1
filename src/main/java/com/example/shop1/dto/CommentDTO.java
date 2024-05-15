package com.example.shop1.dto;


import jakarta.validation.constraints.Min;
import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * DTO для комментариев
 */
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentDTO {

  /**Id автора комментария */
//  Integer id;
  Integer author;

  String createdAt;

  @Min(1)
  Integer pk;
  /**Текст комментария */
  String text;

}
