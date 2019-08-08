package com.chamgoue.eclasse.domain;

import lombok.Data;

import java.util.List;

@Data
public class Tacos {

    private String name;

    private List<Ingredient> ingredients;

}
