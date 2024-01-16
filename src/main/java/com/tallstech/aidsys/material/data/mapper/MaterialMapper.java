package com.tallstech.aidsys.material.data.mapper;

import com.tallstech.aidsys.material.data.dto.MaterialCreateDto;
import com.tallstech.aidsys.material.data.dto.MaterialDto;
import com.tallstech.aidsys.material.data.model.MaterialEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface MaterialMapper {
    MaterialEntity toEntity(MaterialCreateDto dto);
    MaterialDto toDto(MaterialEntity entity);
}
