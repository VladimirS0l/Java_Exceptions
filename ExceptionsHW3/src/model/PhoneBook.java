package model;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private int lastId;
    private final List<Contact> list;
    public PhoneBook(){
        lastId = 0;
        this.list = new ArrayList<>();
    }

    public Contact get(int index){
        return this.list.get(index);
    }

    public int size(){
        return this.list.size();
    }

    public String printPhoneBook(){
        StringBuilder result = new StringBuilder();
        for (Contact h : this.list){
            result.append(h.printContact(h)).append("\n");
        }
        return result.toString();
    }

    public String addContact(String firstName, String lastName, String fatherName, String birthday,
                           int phone, char gender){
        Contact contactAdd = new Contact(firstName, lastName, fatherName, birthday, phone, gender);
        contactAdd.setId(lastId++);
        this.list.add(contactAdd);
        return "Add contact:\n" + contactAdd.printContact(contactAdd);
    }

    public String removeContact(int idMenu){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == idMenu){
                Contact removeContact = list.get(i);
                list.remove(i);
                return "Remove:\n" + removeContact.printContact(removeContact);
            }
        }
        return "Contact is not found";
    }
}
