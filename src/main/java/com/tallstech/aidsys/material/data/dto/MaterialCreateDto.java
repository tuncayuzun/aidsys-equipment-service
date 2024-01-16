package com.tallstech.aidsys.material.data.dto;

import com.tallstech.aidsys.material.data.constant.CategoryTypes;
import jakarta.validation.constraints.NotNull;
public record MaterialCreateDto(
        @NotNull
        CategoryTypes category,
        @NotNull
        String name,
        @NotNull
        String description,
        String picUrl
) {
}
