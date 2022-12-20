package Java_Exceptions.ExcepttionsHW1.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int n = scn.nextInt();
        System.out.println("Enter m: ");
        int m = scn.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        addArr(arr1, rnd);
        addArr(arr2, rnd);
        System.out.println("Массив №1");
        printArr(arr1);
        System.out.println("Массив №2");
        printArr(arr2);
        System.out.println("Возвращает массив из разности элементов двух входящих массивов");
        printArr(subArr(arr1,arr2));
        System.out.println("Возвращает массив из частных элементов двух входящих массивов");
        printArr(divArr(arr1,arr2));
        System.out.println("Второй способ");
        try {
            System.out.println("Number: " + check(arr1, arr2, n, m));
        } catch (Exception e){
            switch (Integer.parseInt(e.getMessage())){
                case 1 -> System.out.println("Длины массивов не равны");
                case 2 -> System.out.println("N и M не равны");
                case 3 -> System.out.println("N меньше нуля");
                case 4 -> System.out.println("М меньше нуля");
            }
        }


    }
    public static void addArr(int[] arr, Random rnd){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 100);
        }
    }
    public static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static int[] subArr(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        try {
            if (arr1.length != arr2.length) throw new Exception("Длины массивов не равны");
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = arr1[i] - arr2[i];
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr3;
    }

    public static int[] divArr(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        try {
            if (arr1.length != arr2.length) throw new Exception("Длины массивов не равны");
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = arr1[i] / arr2[i];
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr3;
    }
    public static boolean check(int[] arr, int[] arr1, int a, int b) throws Exception{
        if (arr.length != arr1.length){
            throw new Exception("1");
        }
        if (a !=  b){
            throw new Exception("2");
        }
        if (a < 0) {
            throw new Exception("3");
        }
        if (b < 0) {
            throw new Exception("4");
        }
        return true;
    }
}






