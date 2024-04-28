import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test ContactService
public class ContactServiceTest {

    // Test add a contact
    @Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "Son", "Goku", "1234567890", "123 Main St");
        contactService.addContact(contact);

        assertEquals(contact, contactService.getContact("1234567890"));
    }

    // Test delete a contact
    @Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "Son", "Goku", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.deleteContact("1234567890");

        assertNull(contactService.getContact("1234567890"));
    }

    // Test update the first name
    @Test
    public void testUpdateFirstName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "Son", "Goku", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.updateFirstName("1234567890", "ChiChi");

        assertEquals("ChiChi", contactService.getContact("1234567890").getFirstName());
    }

    // Test update the last name
    @Test
    public void testUpdateLastName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "Son", "Goku", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.updateLastName("1234567890", "Gohan");

        assertEquals("Gohan", contactService.getContact("1234567890").getLastName());
    }

    // Test update the phone number
    @Test
    public void testUpdatePhone() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "Son", "Goku", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.updatePhone("1234567890", "0987654321");

        assertEquals("0987654321", contactService.getContact("1234567890").getPhone());
    }

    // Test update the address
    @Test
    public void testUpdateAddress() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "Son", "Goku", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.updateAddress("1234567890", "123 1st Street");

        assertEquals("123 1st Street", contactService.getContact("1234567890").getAddress());
    }
}