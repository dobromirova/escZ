package com.escZ.escZ.Model.Entity;

import com.escZ.escZ.Model.Entity.Enum.GradeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "grades")
public class Grade extends BaseEntity{

    private GradeEnum gradeName;

    public Grade() {
    }

    @Enumerated(EnumType.STRING)
    public GradeEnum getGrade() {
        return gradeName;
    }

    public void setGrade(GradeEnum grade) {
        this.gradeName = grade;
    }
}
