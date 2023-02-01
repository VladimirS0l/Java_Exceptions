package model;

import presenter.Presenter;

import java.io.*;
import java.util.List;

public class SaveTxt {
    private List<Contact> list;
    private String path = "db.txt";

    public SaveTxt(List<Contact> list) {
        this.list = list;
    }

    public SaveTxt() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void saveAs(Contact contact) {
        System.out.println(contact);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(contact);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void readbd(PhoneBook list) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Contact c1 = (Contact) ois.readObject();
            list.addContact(c1.getFirstName(), c1.getLastName(), c1.getFatherName(),
                    c1.getBirthday(), c1.getPhone(), c1.getGender());
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
