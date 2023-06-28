package com.geekster.UserManagement.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class User {

    private int userId;

    @NotEmpty(message = "Username cannot be empty")
    private String username;

    @NotNull(message = "Date of Birth cannot be empty")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of Birth should be in the format yyyy-MM-dd")
    private String dateOfBirth;

    @NotEmpty(message = "Email cannot be empty")
    //@Email(message = "Invalid email format")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]+$", message = "Enter Valid Email")
    private String email;

    @NotEmpty(message = "Phone Number cannot be empty")
    @Pattern(regexp= "^\\+[1-9]\\d{1,2}\\d{9}$", message = "Phone Number should be 12 digits long (country code + phone number)")
    private String phoneNumber;

    private String date;
    private String time;
}
