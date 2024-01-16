package com.tallstech.aidsys.material.api.controller;

import java.util.Map;

import com.tallstech.aidsys.material.api.MaterialApi;
import com.tallstech.aidsys.material.data.dto.MaterialCreateDto;
import com.tallstech.aidsys.material.service.MaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class MaterialController implements MaterialApi {

    private final MaterialService service;

    @Override
    public ResponseEntity<Object> createAidMaterial(Map<String, String> header, MaterialCreateDto materialCreateDto) {
        return ResponseEntity.ok(service.createMaterial(materialCreateDto));
    }
}
