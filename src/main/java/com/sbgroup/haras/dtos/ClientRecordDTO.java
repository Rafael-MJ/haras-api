package com.sbgroup.haras.dtos;

import jakarta.validation.constraints.NotBlank;

public record ClientRecordDTO(
        @NotBlank String name) {
}
