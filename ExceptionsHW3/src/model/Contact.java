package model;

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String birthday;
    private int phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    private char gender;

    public Contact(String firstName, String lastName, String fatherName, String birthday,
                   int phone, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    public Contact(){};

    public String printContact(Contact contact){
        StringBuilder result = new StringBuilder();
        result = new StringBuilder("id human: " + contact.id + "\n" + "Firstname human: " + contact.lastName +
                "\n" + "LastName human: " + contact.lastName + "\n" + "FatherName human: " + contact.fatherName +
                "\n" + "Birthday human: " + contact.birthday + "\n" + "Phone human: " + contact.phone +
                "\n" + "Gender human: " + contact.gender);

        return result.toString();
    }
}
