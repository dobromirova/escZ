package com.escZ.escZ.Model.Entity.Enum;

public enum GradeEnum {
    FOUR_A("4a"),
    FOUR_B("4b"),
    FOUR_C("4c"),

    FIVE_A("5a"),
    FIVE_B("5b"),
    FIVE_C("5c"),

    SIX_A("6a"),
    SIX_AP("6a+"),
    SIX_B("6b"),
    SIX_BP("6b+"),
    SIX_C("6c"),
    SIX_CP("6c+"),

    SEVEN_A("7a"),
    SEVEN_AP("7a+"),
    SEVEN_B("7b"),
    SEVEN_BP("7b+"),
    SEVEN_C("7c"),
    SEVEN_CP("7c+");

    private final String value;

    GradeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
