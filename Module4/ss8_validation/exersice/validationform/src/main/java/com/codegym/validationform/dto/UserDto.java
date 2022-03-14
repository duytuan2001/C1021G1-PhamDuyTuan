package com.codegym.validationform.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import javax.validation.constraints.*;


public class UserDto implements Validator {

    @NotBlank
    @Size(min= 5, max = 45)
    private String firstName;

    @NotBlank
    @Size(min= 5, max = 45)
    private String lastName;


    private String phoneNumber;

    @Min(18)
    private int age;

    @Email
    private String Email;

    public UserDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        String number = userDto.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors, "number","number.empty", "");
        if (number.length()>11 || number.length()<10){
            errors.rejectValue("number","number.length", "");
        }
        if (!number.startsWith("0")){
            errors.rejectValue("number","number.startsWith", "");
        }
        if (!number.matches("(^$|[0-9]*$)")){
            errors.rejectValue("number","number.matches", "");
        }
    }
}
