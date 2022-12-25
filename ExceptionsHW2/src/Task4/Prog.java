package Task4;

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        System.out.println("Enter str: ");
        Scanner scn = new Scanner(System.in);
        UserInput str = new UserInput();
        str.setStr(scn.nextLine());
        scn.close();
        String str1 = str.toString();
        try {
            if (check(str1)){
                System.out.println("String: " + str);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean check(String str) throws Exception {
        if (str.length() == 0){
            throw new Exception("Пустую строку вводить нельзя!");
        }
        return true;
    }

}

class UserInput{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return this.str;
    }
}
