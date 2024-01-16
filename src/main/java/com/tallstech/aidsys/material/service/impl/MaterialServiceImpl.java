package com.tallstech.aidsys.material.service.impl;

import com.tallstech.aidsys.material.data.dto.MaterialCreateDto;
import com.tallstech.aidsys.material.data.dto.MaterialDto;
import com.tallstech.aidsys.material.data.mapper.MaterialMapper;
import com.tallstech.aidsys.material.repository.MaterialRepository;
import com.tallstech.aidsys.material.service.MaterialService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Transactional
@RequiredArgsConstructor
@Service
public class MaterialServiceImpl implements MaterialService {

    private final MaterialRepository repository;
    private final MaterialMapper mapper;

    @Override
    public MaterialDto createMaterial(MaterialCreateDto materialCreateDto) {
        var savedMaterial = repository.save(mapper.toEntity(materialCreateDto));
         return mapper.toDto(savedMaterial);
    }
}
