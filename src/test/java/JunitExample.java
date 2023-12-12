import org.junit.jupiter.api.Test;

import com.example.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testValidFirstName() {
        assertTrue(Main.isValidFirstName("John")); // Happy case
        assertFalse(Main.isValidFirstName("john1")); // Sad case
    }

    @Test
    void testValidLastName() {
        assertTrue(Main.isValidFirstName("Doe")); // Happy case
        assertFalse(Main.isValidFirstName("Doe1")); // Sad case
    }

    @Test
    void testValidEmail() {
        assertTrue(Main.isValidEmail("example@example.com")); // Happy case
        assertFalse(Main.isValidEmail("example")); // Sad case
    }

    @Test
    void testValidMobileNumber() {
        assertTrue(Main.isValidMobileNumber("91 9919819801")); // Happy case
        assertFalse(Main.isValidMobileNumber("919919819801")); // Sad case
    }

    @Test
    void testValidPassword() {
        assertTrue(Main.isValidPassword("Password7834791@")); // Happy case
        assertFalse(Main.isValidPassword("password")); // Sad case
    }
}