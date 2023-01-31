package presenter;

import com.sun.jdi.IntegerValue;
import model.Check;
import view.TextMenu;
import view.View;

public class ToPresenter {
    private Presenter presenter = new Presenter();

    public void doSomething(String userSelect){
        View input = new View();
        switch (userSelect) {
            case "1":
                //посмотреть всех людей
                presenter.printAllContact();
                break;
            case "2":
                //добавить человека
                String firstName = input.inputKey(TextMenu.choiceName);
                while (!(Check.checkStr(firstName) && Check.checkLength(firstName) &&
                        Check.containsWhiteSpace(firstName))) {
                    System.out.println("Вы ввели неверное значение");
                    firstName = input.inputKey(TextMenu.choiceName);
                }
                String lastName = input.inputKey(TextMenu.choiceLastName);
                while (!(Check.checkStr(lastName) && Check.checkLength(lastName) &&
                        Check.containsWhiteSpace(lastName))) {
                    System.out.println("Вы ввели неверное значение");
                    lastName = input.inputKey(TextMenu.choiceLastName);
                }
                String fatherName = input.inputKey(TextMenu.choiceFatherName);
                while (!(Check.checkStr(fatherName) && Check.checkLength(fatherName) &&
                        Check.containsWhiteSpace(fatherName))) {
                    System.out.println("Вы ввели неверное значение");
                    fatherName = input.inputKey(TextMenu.choiceFatherName);
                }
                String birthday = input.inputKey(TextMenu.choiceBirthday);
                while (!Check.isValid(birthday)) {
                    birthday = input.inputKey(TextMenu.choiceBirthday);
                }
                int phone = 0;
                try {
                    phone = Integer.parseInt(input.inputKey(TextMenu.choicePhone));
                } catch (Exception ex) {
                    System.out.println("Error");
                    phone = Integer.parseInt(input.inputKey(TextMenu.choicePhone));
                }
                char gender = (input.inputKey(TextMenu.choiceGender)).charAt(0);
                while (!Check.checkChar(gender)){
                    System.out.println("Error");
                    gender = (input.inputKey(TextMenu.choiceGender)).charAt(0);
                }
                presenter.addContact(firstName, lastName, fatherName, birthday, phone, gender);
                break;
            case "3":
                //удалить человека
                int id = Integer.parseInt(input.inputKey(TextMenu.choiceId));
                presenter.removeContact(id);
                break;
            case "4":
                //Сохранить в txt
                int idTxt = Integer.parseInt(input.inputKey(TextMenu.choiceId));
                presenter.addTxt(idTxt);

                break;
            case "5":
                //Загрузить бд
                presenter.loadDb();
                break;
        }
    }



}
