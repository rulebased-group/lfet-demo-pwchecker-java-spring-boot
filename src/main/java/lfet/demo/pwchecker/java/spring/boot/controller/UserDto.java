package lfet.demo.pwchecker.java.spring.boot.controller;

import lfet.demo.pwchecker.java.spring.boot.validator.StrongPassword;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @StrongPassword
    private String password;
}
