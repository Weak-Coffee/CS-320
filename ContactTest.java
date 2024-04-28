import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for Contact creation
public class ContactTest {

    // Test Contact creation
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("1234567890", "Son", "Goku", "1234567890", "123 Main St");

        assertNotNull(contact);

        // Assert that contact fields match the provided values
        assertEquals("1234567890", contact.getContactID());
        assertEquals("Son", contact.getFirstName());
        assertEquals("Goku", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }
    // Test for ID too long
    @Test
    void testContactClassIdTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10000000000", "Son", "Goku", "0987654321",
                    "316 Pie St. Mora, MN 55051");
        });
    }
    // Test for Contact is null
    @Test
    void testContactClassIdNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Son", "Goku", "0987654321",
                    "316 Pie St. Mora, MN 55051");
        });
    }
    // Test for first name too long
    @Test
    void testContactClassFirstNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10001", "TienShinhan", "Goku", "0987654321",
                    "0987654321");
        });
    }
    // Test for first name is null
    @Test
    void testContactClassFirstNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10001", null, "Goku", "0987654321",
                    "316 Pie St. Mora, MN 55051");
        });
    }
    // Test for last name is too long
    @Test
    void testContactClassLastNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10001", "Son", "TienShinhan", "0987654321",
                    "316 Pie St. Mora, MN 55051");
        });
    }
    // Test for last name is null
    @Test
    void testContactClassLastNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10001", "Son", null, "0987654321",
                    "316 Pie St. Mora, MN 55051");
        });
    }
    // Test for phone number is not 10 digits
    @Test
    void testContactClassPhoneNotTen() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10001", "Son", "Goku", "123456789",
                    "316 Pie St. Mora, MN 55051");
        });
    }
    // Test for Phone is null
    @Test
    void testContactClassPhoneNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10001", "Son", "Goku", null,
                    "316 Pie St. Mora, MN 55051");
        });
    }
    // Test for address is too long
    @Test
    void testContactClassAddressTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10001", "Son", "Goku", "0987654321",
                    "316 Pie St. Mora, MN 55051 123456");
        });
    }
    // Test for address is null
    @Test
    void testContactClassAddressNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10001", "Son", "Goku", "0987654321",
                    null);
        });
    }
}