package com.db.grad.javaapi.service;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class PasswordEncryptorTest {
    public static String encrypt(String plaintext) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(plaintext.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // Test cases
        String[] passwords = {
                "password123",
                "securePassword",
                "test123",
                "hello123",
                "p@ssw0rd!"
        };

        for (String password : passwords) {
            String encryptedPassword = encrypt(password);
            System.out.println("Plaintext Password: " + password);
            System.out.println("SHA-256 Encrypted Pass + encryptedPassword");
            System.out.println();
        }
    }
}
