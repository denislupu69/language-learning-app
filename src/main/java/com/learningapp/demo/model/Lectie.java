package com.learningapp.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Lectie {
    private String titlu;
    private String continut;
    private int durataMinute;
    private boolean finalizata;
}
