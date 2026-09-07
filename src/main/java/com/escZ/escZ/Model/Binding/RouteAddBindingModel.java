package com.escZ.escZ.Model.Binding;

import com.escZ.escZ.Model.Entity.Enum.GradeEnum;
import org.springframework.web.multipart.MultipartFile;

public class RouteAddBindingModel {

    private String name;
    private String description;
    private MultipartFile gpxCoordinates;
    private GradeEnum gradeType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(MultipartFile gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public GradeEnum getGradeType() {
        return gradeType;
    }

    public void setGradeType(GradeEnum gradeType) {
        this.gradeType = gradeType;
    }
}
