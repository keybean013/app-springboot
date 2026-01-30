package com.example.api.enums.role;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;

public class EnumValueValidator
        implements ConstraintValidator<EnumValue, String> {

    private Enum<?>[] enumValues;

    @Override
    public void initialize(EnumValue constraintAnnotation) {
        enumValues = constraintAnnotation.enumClass().getEnumConstants();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return true; // allow partial update

        return Arrays.stream(enumValues)
                .anyMatch(e -> e.name().equalsIgnoreCase(value));
    }
}
