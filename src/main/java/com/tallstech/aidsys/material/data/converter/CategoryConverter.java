package com.tallstech.aidsys.material.data.converter;

import java.util.Objects;
import java.util.stream.Stream;

import com.tallstech.aidsys.material.data.constant.CategoryTypes;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.util.StringUtils;


@Converter(autoApply = true)
public class CategoryConverter implements AttributeConverter<CategoryTypes, String> {

    @Override
    public String convertToDatabaseColumn(CategoryTypes categoryType) {
        return Objects.nonNull(categoryType) ? categoryType.getCategory() : null;
    }

    @Override
    public CategoryTypes convertToEntityAttribute(String category) {
        if (!StringUtils.hasText(category)) {
            return null;
        }
        return Stream.of(CategoryTypes.values())
                .filter(item -> item.getCategory().equals(category))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
