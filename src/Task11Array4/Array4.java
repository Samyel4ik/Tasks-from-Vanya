package Task11Array4;

import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        //В одномерном массиве, состоящем из n вещественных элементов, вычислить:
        // - номер минимального по модулю элемента массива; т е  порядковый номер  минимального числа
        // - сумму модулей элементов массива, расположенных после первого отрицательного
        //элемента.
        int n = 10;
        int []array = new int[n];
        int min = array[0];
        int sum = 1;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) - 5;
            if (array[0]<array[i]){
                min = i;
            }

            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Минимальный номер минимального числа в массиве: " + min);


    }
}
