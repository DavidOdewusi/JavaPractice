package com.assignment.combinatorpattern;

import javax.xml.validation.Validator;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static com.assignment.combinatorpattern.CustomerRegistrationValidation.*;
import static com.assignment.combinatorpattern.CustomerRegistrationValidation.ValidationResult.*;

public interface CustomerRegistrationValidation
        extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidation isEmailValid() {
        return customer -> customer.getEmail().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidation isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("+0") ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidation isAdult() {
        return customer ->
                Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }

//    default  CustomerRegistrationValidation and (CustomerRegistrationValidation other) {
//        return customer ->
//                ValidationResult result = this.apply(customer);
//    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
