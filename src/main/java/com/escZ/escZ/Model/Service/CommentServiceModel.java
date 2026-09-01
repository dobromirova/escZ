package com.escZ.escZ.Model.Service;

public class CommentServiceModel {

    private Long routeId;
    private String message;
    private String author;

    public Long getRouteId() {
        return routeId;
    }

    public CommentServiceModel setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
