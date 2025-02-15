package com.learningapp.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Utilizator {
    private String nume;
    private int varsta;
    private String limbaStudiate;
    private double progres;
}