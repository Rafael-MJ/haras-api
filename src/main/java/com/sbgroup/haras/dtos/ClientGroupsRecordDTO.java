package com.sbgroup.haras.dtos;

import jakarta.validation.constraints.NotNull;

public record ClientGroupsRecordDTO(
        @NotNull int clientQuota) {
}