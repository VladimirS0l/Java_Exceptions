package Task3;

//В этом задании убрал throws Exception из функций Мэйн и ПринтСум, переиминовал Trowable ex в Exception и перенес в
//списка кэтчей
public class Prog {
    public static void main(String[] args){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(int a, int b){
        System.out.println(a + b);
    }
}
