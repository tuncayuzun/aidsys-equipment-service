package com.tallstech.aidsys.material.data;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.tallstech.aidsys.material.data.dto.MaterialCreateDto;
import com.tallstech.aidsys.material.data.dto.MaterialDto;
import com.tallstech.aidsys.material.data.mapper.MaterialMapper;
import com.tallstech.aidsys.material.data.model.MaterialEntity;
import org.mapstruct.factory.Mappers;


public class MaterialTestData {

    private static ObjectMapper objectMapper;

    private static MaterialMapper materialMapper;

    private static ObjectMapper getObjectMapper() {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
            objectMapper
                    .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                    .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
                    .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            JavaTimeModule javaTimeModule = new JavaTimeModule();
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            objectMapper.registerModule(javaTimeModule);
        }

        return objectMapper;
    }

    private static MaterialMapper getMaterialMapper() {
        return Objects.nonNull(materialMapper) ? materialMapper : Mappers.getMapper(MaterialMapper.class);
    }

    public static MaterialCreateDto materialCreateDto() throws IOException {
        return getObjectMapper().readValue(new File("src/test/resources/req_material_create.json"), MaterialCreateDto.class);
    }

    public static MaterialDto materialDto() throws IOException {
        return getObjectMapper().readValue(new File("src/test/resources/res_material_create.json"), MaterialDto.class);
    }

    public static MaterialEntity materialEntity() throws IOException {
        return getObjectMapper().readValue(new File("src/test/resources/res_material_create.json"), MaterialEntity.class);
    }

    public static MaterialDto materialResponseDto() throws IOException {
        return getMaterialMapper().toDto(materialEntity());
    }


}
