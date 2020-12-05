package com.example.validate.exvalidate.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PeriodValidator implements ConstraintValidator<LimitSearchPeriod, ValidPeriod> {

    @Override
    public void initialize(LimitSearchPeriod constraintAnnotation) {

    }

    @Override
    public boolean isValid(ValidPeriod value, ConstraintValidatorContext context) {
        return value.isValidPeriod();
    }

}
