package com.tallstech.aidsys.material.data.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CategoryTypes {
    FOOD("food"),
    HEALTH("health"),
    MACHINE("machine"),
    CLOTHING("clothing"),
    ENERGY("energy"),
    OTHER("other");

    private final String category;
}
