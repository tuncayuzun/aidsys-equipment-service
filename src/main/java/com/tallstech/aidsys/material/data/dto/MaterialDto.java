package com.tallstech.aidsys.material.data.dto;

import java.util.UUID;

import com.tallstech.aidsys.material.data.constant.CategoryTypes;


public record MaterialDto(
        UUID id,
        CategoryTypes category,
        String name,
        String description,
        String picUrl
) {
}
