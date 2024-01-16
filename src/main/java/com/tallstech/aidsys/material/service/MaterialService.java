package com.tallstech.aidsys.material.service;

import com.tallstech.aidsys.material.data.dto.MaterialCreateDto;
import com.tallstech.aidsys.material.data.dto.MaterialDto;


public interface MaterialService {
    MaterialDto createMaterial(MaterialCreateDto materialCreateDto);
}
