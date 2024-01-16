package com.tallstech.aidsys.material.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.io.IOException;

import com.tallstech.aidsys.material.data.MaterialTestData;
import com.tallstech.aidsys.material.data.mapper.MaterialMapper;
import com.tallstech.aidsys.material.repository.MaterialRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


@DisplayName("Material Service Layer Test")
class MaterialServiceImplTest {

    @InjectMocks
    private MaterialServiceImpl service;
    @Mock
    private MaterialRepository repository;
    @Mock
    private MaterialMapper mapper;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("When creating aid  material")
    void createMaterial() throws IOException {
        var createDto = MaterialTestData.materialCreateDto();
        var entity = MaterialTestData.materialEntity();
        var responseDto = MaterialTestData.materialResponseDto();

        doReturn(entity).when(mapper).toEntity(createDto);
        doReturn(responseDto).when(mapper).toDto(entity);
        when(repository.save(any())).thenReturn(entity);

        var result = service.createMaterial(createDto);

        assertAll("Results...",
                () -> assertNotNull(result),
                () -> assertThat("Bakliyat", equalTo(result.name()))
        );

    }
}