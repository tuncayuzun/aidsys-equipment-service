package com.tallstech.aidsys.material.data.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tallstech.aidsys.material.data.constant.CategoryTypes;
import com.tallstech.aidsys.material.data.model.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "materials", schema = "material_sch")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaterialEntity extends BaseEntity {
    @NotNull
    private CategoryTypes category;
    @NotNull
    private String name;
    @NotNull
    private String description;
    private String picUrl;


}
