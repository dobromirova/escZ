package com.escZ.escZ.Model.Service;

import com.escZ.escZ.Model.Entity.Enum.GradeEnum;
import com.escZ.escZ.Model.Entity.Picture;
import com.escZ.escZ.Model.Entity.User;

import java.util.Set;

public class RouteServiceModel {

    private Long id;
    private String gpxCoordinates;
    private String description;
    private String name;
    private GradeEnum grade;
    private User author;
    private Set<Picture> pictures;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GradeEnum getGrade() {
        return grade;
    }

    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }
}
