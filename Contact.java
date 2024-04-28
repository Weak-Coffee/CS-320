// Define the Contact class
public class Contact {
    private final String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Initialize contact details
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid ID Number");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid First Name");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid Address");
        }
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Get contact ID
    public String getContactID() {
        return contactID;
    }

    // Get first name
    public String getFirstName() {
        return firstName;
    }

    // Get last name
    public String getLastName() {
        return lastName;
    }

    // Get phone number
    public String getPhone() {
        return phone;
    }

    // Get address
    public String getAddress() {
        return address;
    }

    // Set first name
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    // Set last name
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    // Set phone number
    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    // Set address
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}