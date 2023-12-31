package com.example.cooperationtool.domain.card.dto;

import com.example.cooperationtool.domain.column.entity.Columns;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardRequestDto {

    @NotBlank
    private String title;

    @NotBlank
    private Long columnsId;

}
