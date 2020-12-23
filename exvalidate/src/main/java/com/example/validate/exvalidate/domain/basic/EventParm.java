package com.example.validate.exvalidate.domain.basic;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import lombok.Data;


// https://docs.oracle.com/javaee/7/api/javax/validation/constraints/package-summary.html

@Data
public class EventParm {

    @NotNull(message = "이름을 넣어주세요")
    private String name;

    @Null(message = "이름은 null이어야 합니다.")
    private String nameNull;
}
