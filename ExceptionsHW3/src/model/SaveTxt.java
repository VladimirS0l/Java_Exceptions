package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class SaveTxt {

    private List<Contact> list;
    private String path = "db.txt";

    public SaveTxt(List<Contact> list) {
        this.list = list;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void saveAs(String contact) {
        System.out.println(contact);
        try(FileWriter writer = new FileWriter(path, false)){
            writer.write(contact);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readbd() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            reader.read();
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String fatherName = reader.readLine();
                String bday = reader.readLine();
                int fnumber = reader.read();
                char gender = (char) reader.read();
                list.add(new Contact(fname, lname, fatherName, bday, fnumber, gender));
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
