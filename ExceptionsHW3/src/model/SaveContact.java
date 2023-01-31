package model;


import java.util.List;

public class SaveContact {
    private List<Contact> list;
    public String saveTxt(PhoneBook list, int idMenu) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idMenu) {
                SaveTxt txt = new SaveTxt(this.list);
                txt.saveAs(list.get(i).toString());
                return "Записан в txt: " + list.get(i).toString() + "\n";
            }
        }
        return "Not found";
    }

    public String loadTxt() {
        SaveTxt txt = new SaveTxt(list);
        txt.readbd();
        return "База данных загружена";
    }
}
