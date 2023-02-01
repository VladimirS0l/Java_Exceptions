package view;

public class TextMenu {
    public static String menu = """
            \n
            1 - посмотреть всех\\s
            2 - добавить человека \\s
            3 - удалить человека по id\\s
            4 - сохранить в txt человека по id\\s
            5 - загрузить базу данных \\s
            
            q - выход
             \
                       
            """;

    public static String choiceName = "Введите имя(Только буквы не более 16  символов): ";
    public static String choiceLastName = "Введите фамилию(Только буквы не более 16  символов): ";
    public static String choiceId = "Введите ID контакта: ";
    public static String choiceFatherName = "Введите отчество(Только буквы не более 16  символов):: ";
    public static String choiceBirthday = "Введите дату рождения(В формате dd/mm/yyyy: ";
    public static String choicePhone = "Введите номер(Только числа не более 15 символов): ";
    public static String choiceGender = "Введите пол (Один символ f или m): ";

}
