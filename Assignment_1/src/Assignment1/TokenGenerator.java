package Assignment1;

import java.security.SecureRandom;
import java.util.Base64;

public class TokenGenerator {
    public static String generateToken() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[6]; 
        random.nextBytes(bytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }

    public static void main(String[] args) {
        String token = generateToken();
        System.out.println("Generated Token: " + token);
    }
}