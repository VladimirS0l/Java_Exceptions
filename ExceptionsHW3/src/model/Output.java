package model;

public class Output {
    public String outputStr(String str){
        return str + "\n";
    }

    public String outputPhoneBook(PhoneBook list){
        String result = "";
        result = list.printPhoneBook();
        return result;
    }
}
