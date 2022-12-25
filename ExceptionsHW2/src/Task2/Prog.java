package Task2;

//Вроде бы всё верно, только не было массива самого, в данном задании просто задал массив intArray,
//Арифметик эксепшен выводит при делении на ноль, подставлял вместо d другие числа всё ок
//работает
//Если подставить массив дробных чисел, при делении выводит "catchedRes1 = Infinity"

public class Prog {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 2, 3, 22, 1, 23, 3, 4, 5, 6};
            //double[] intArray = {1, 2, 3, 22, 1, 23, 3, 4, 5, 6};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
