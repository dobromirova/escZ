package com.escZ.escZ.Model.Binding;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class NewCommentBindingModel {

    @NotBlank
    @Size(min = 1)
    private String message;

    public String getMessage() {
        return message;
    }

    public NewCommentBindingModel setMessage(String message) {
        this.message = message;
        return this;
    }

}
