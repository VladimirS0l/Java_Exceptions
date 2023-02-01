package model;


import java.util.List;

public class SaveContact {
    private List<Contact> list;
    public String saveTxt(PhoneBook list, int idMenu) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idMenu) {
                SaveTxt txt= new SaveTxt(this.list);
                txt.saveAs(list.get(i));
                return "Записан в txt: " + list.get(i).getFirstName() +" " + list.get(i).getLastName() + "\n";
            }
        }
        return "Контакт не найден";
    }

    public String loadTxt(PhoneBook list) {
        SaveTxt txt = new SaveTxt();
        txt.readbd(list);
        return "База данных загружена";
    }
}
