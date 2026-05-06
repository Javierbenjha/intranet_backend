package com.example.intranet_school.domain.ports.out;

public interface PasswordEncryptorPort {
    String encode(String rawPassword);
    boolean matches(String rawPassword, String encodedPassword);
}
