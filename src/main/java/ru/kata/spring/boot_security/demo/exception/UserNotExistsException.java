package ru.kata.spring.boot_security.demo.exception;

import org.springframework.dao.DataIntegrityViolationException;

public class UserNotExistsException extends DataIntegrityViolationException {
    public UserNotExistsException(String msg) {
        super(msg);
    }
}
