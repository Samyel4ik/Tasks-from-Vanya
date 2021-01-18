package Task1;

import java.sql.SQLOutput;

public class While {
    public static void main(String[] args) {
        // Вводить последовательность чисел до тех пор, пока их сумма не достигнет М(М
        //вводится и больше 0).Ввести, какое количество чисел составили искомую сумму
        //(саму сумму тоже).
        int m = 15;
        int i = 0;
        int sum = 0;
        int z = 0; //количество числе.

        while (i >= 0) {

            i++;
            z++;
            System.out.print(i + " ");
            sum = sum + i;


            if (sum >= m) {
                sum = sum;
                i = i;
                break;
            }
        }
        System.out.println("Сумма чисел " + sum);
        System.out.println("Количество числе составивших сумму" + z);
    }
}
