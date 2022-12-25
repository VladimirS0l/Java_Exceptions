package Task1;

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        try {
            System.out.println("Enter number: ");
            Scanner scn = new Scanner(System.in);
            double n = new Number(scn.nextDouble()).getX();
            scn.close();
            System.out.println(n);
        }catch (Exception e){
            System.out.println("Вы ввели не число, попробуйте еще раз");
            System.out.println("Enter number: ");
            Scanner scn = new Scanner(System.in);
            double n = new Number(scn.nextDouble()).getX();
            scn.close();
            System.out.println(n);
        }
    }
}

class Number{
    public Number(double x) {
        this.x = x;
    }

    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
