package Task10Array3;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        //В одномерном массиве, состоящем из n целых элементов,
        // вычислить произведение элементов массива с четными номерами;
        int n = 10;
        int[] array = new int[n];
        int index = 0;
        int multiplay = 1;

        Random random = new Random();

        for (int i = 0; i < array.length; i=i+2) {
            array[i] = random.nextInt(10) - 5;
                                                            // как тут вывести мой массив в консоль ??
            index = i;
            multiplay = multiplay * array[index];
        }
        System.out.println();
        System.out.println("Произведение чисел с четными номерами:" + multiplay);
    }
}
