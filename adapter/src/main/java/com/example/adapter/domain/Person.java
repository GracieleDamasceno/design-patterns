package com.example.adapter.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private String name;

    private Integer age;

    private String address;

    private LocalDate dateOfBirth;

    private String nationality;

    private String email;
}
