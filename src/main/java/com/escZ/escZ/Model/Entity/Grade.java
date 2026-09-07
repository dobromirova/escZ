package com.escZ.escZ.Model.Entity;

import com.escZ.escZ.Converter.GradeEnumConverter;
import com.escZ.escZ.Model.Entity.Enum.GradeEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "grades")
public class Grade extends BaseEntity{

    private GradeEnum grade;

    public Grade() {
    }

    @Convert(converter = GradeEnumConverter.class)
    @Column(nullable = false, length = 3)
    public GradeEnum getGrade() {
        return grade;
    }

    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }
}
