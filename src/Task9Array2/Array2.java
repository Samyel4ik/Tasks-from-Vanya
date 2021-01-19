package Task9Array2;

import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        //В одномерном массиве, состоящем из n вещественных элементов,
        // вычислить сумму положительных элементов массива;
        int n = 10;
        int []array = new int[n];
        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(10)-5;

            if (array[i]>0){
                sum = sum + array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Сумма положительных элементов: " + sum);
    }
}
