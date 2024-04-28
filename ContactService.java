import java.util.HashMap;
import java.util.Map;

// Class for managing contacts
public class ContactService {
    private final Map<String, Contact> contacts; // Map for storing contacts

    public ContactService() {
        contacts = new HashMap<>();
    }

    // Add a contact to the map
    public void addContact(Contact contact) {
        contacts.putIfAbsent(contact.getContactID(), contact);
    }

    // Delete a contact from the map
    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }

    // Update different fields of a contact
    public void updateFirstName(String contactID, String newFirstName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setFirstName(newFirstName);
        }
    }

    public void updateLastName(String contactID, String newLastName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setLastName(newLastName);
        }
    }

    public void updatePhone(String contactID, String newPhone) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setPhone(newPhone);
        }
    }

    public void updateAddress(String contactID, String newAddress) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setAddress(newAddress);
        }
    }

    // Get a contact by its ID
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}
