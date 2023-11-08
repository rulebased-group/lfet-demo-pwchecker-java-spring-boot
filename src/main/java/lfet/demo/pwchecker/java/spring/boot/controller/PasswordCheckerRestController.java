package lfet.demo.pwchecker.java.spring.boot.controller;


import lfet.demo.pwchecker.java.spring.boot.service.PasswordCheckerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PasswordCheckerRestController {
    final PasswordCheckerUseCase passwordCheckerUseCase;

    @GetMapping(value = "/password/check")
    public ResponseEntity<List<String>> check(@RequestParam(name = "password") String password) {
        List<String> checks = passwordCheckerUseCase.check(password);
        if (checks.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(checks);
        }
    }

}
