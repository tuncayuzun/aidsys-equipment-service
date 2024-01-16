package com.tallstech.aidsys.material.repository;

import java.util.UUID;

import com.tallstech.aidsys.material.data.model.MaterialEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MaterialRepository extends CrudRepository<MaterialEntity, UUID> {
}
