package lfet.demo.pwchecker.java.spring.boot.service;

import java.util.List;

public interface PasswordCheckerUseCase {

    List<String> check(String password);
}
