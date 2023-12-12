import org.junit.jupiter.api.Test;

import com.example.Main;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testValidFirstName() {
        assertTrue(Main.isValidFirstName("John"));
        assertFalse(Main.isValidFirstName("john1"));
    }

    @Test
    void testValidLastName() {
        assertTrue(Main.isValidFirstName("Doe"));
        assertFalse(Main.isValidFirstName("Doe1"));
    }

    @Test
    void testValidEmail() {
        assertTrue(Main.isValidEmail("example@example.com"));
        assertFalse(Main.isValidEmail("example"));
    }

    @Test
    void testValidMobileNumber() {
        assertTrue(Main.isValidMobileNumber("91 9919819801"));
        assertFalse(Main.isValidMobileNumber("919919819801"));
    }

    @Test
    void testValidPassword() {
        assertTrue(Main.isValidPassword("Password@167"));
        assertFalse(Main.isValidPassword("password")); 
    }

    @ParameterizedTest
    @ValueSource(strings = {"example1@example.com", "example2@example.com", "example3@example.com"})
    void testValidEmail(String email) {
        assertTrue(Main.isValidEmail(email));
    }
}