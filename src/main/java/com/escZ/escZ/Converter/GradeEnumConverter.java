package com.escZ.escZ.Converter;


import com.escZ.escZ.Model.Entity.Enum.GradeEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class GradeEnumConverter implements AttributeConverter<GradeEnum, String> {

    @Override
    public String convertToDatabaseColumn(GradeEnum grade) {
        return grade == null ? null : grade.getValue();
    }

    @Override
    public GradeEnum convertToEntityAttribute(String value) {
        if (value == null) {
            return null;
        }

        for (GradeEnum grade : GradeEnum.values()) {
            if (grade.getValue().equals(value)) {
                return grade;
            }
        }

        throw new IllegalArgumentException(
                "Unknown grade: " + value
        );
    }
}
