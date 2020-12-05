package com.example.validate.exvalidate.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import java.lang.annotation.RetentionPolicy;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { PeriodValidator.class })
public @interface LimitSearchPeriod {
    String message() default "기간이 유효하지 않습니다."; // 애노테이션 지정 시 validatino rule에 맞는 메시지 지정 가능!!!

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
