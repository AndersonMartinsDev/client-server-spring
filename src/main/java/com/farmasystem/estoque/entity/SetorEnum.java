package com.farmasystem.estoque.entity;

public enum SetorEnum {

    ALMOXARIFADO("Almoxarifado"),
    SOROLOGIA("Sorologia");

    private String setor;

    SetorEnum(String stor) {
        this.setor = stor;
    }
}
