package com.kaduFranca.Detetive_game_api.Dtos;

import com.kaduFranca.Detetive_game_api.models.LocalModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String pawnColor;
    @NotBlank
    private LocalModel initLocal;
}
