package presenter;

import model.PhoneBook;
import model.Output;
import view.ConsoleView;
import model.SaveContact;

public class Presenter {
    private final PhoneBook list = new PhoneBook();
    private final Output output = new Output();
    private final SaveContact save = new SaveContact();

    public void printAllContact(){
        ConsoleView.print(output.outputPhoneBook(list));
    }

    public void addContact(String firstName, String lastName, String fatherName, String birthday,
                         int phone, char gender){
        ConsoleView.print(output.outputStr(list.addContact(firstName, lastName, fatherName, birthday,
                phone, gender)));
    }

    public void removeContact(int id){
        ConsoleView.print(output.outputStr(list.removeContact(id)));
    }

    public void addTxt(int id) {ConsoleView.print(output.outputStr(save.saveTxt(list, id)));}

    public void loadDb(){ConsoleView.print(output.outputStr(save.loadTxt()));}
}

