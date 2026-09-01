package com.escZ.escZ.Model.Entity.Enum;

public enum GradeEnum {
    FOA("4a"), FOB("4b"), FOC("4c"),
    FIA("5a"), FIB("5b"), FIC("5c"),
    SIA("6a"), SIAP("6a+"),
    SIB("6b"), SIBP("6b+"),
    SIC("6c"), SICP("6c+"),
    SEA("7a"), SEP("7a+"),
    SEB("7b"), SEBP("7b+"),
    SEC("7c"), SECP("7c+"),
    EA("8a"), EAP("8a+"),
    EB("8b"), EBP("8b+"),
    EC("8c"), ECP("8c+"),
    NA("9a"), NAP("9a+"),
    NB("9b"), NBP("9b+"),
    NC("9c");

    public final String grade;

    private GradeEnum(String grade) {
        this.grade = grade;
    }

}
