package com.ra.democrud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {

    private Long studentId;
    private String studentName;
    private Integer age;
    private Boolean sex;


}
