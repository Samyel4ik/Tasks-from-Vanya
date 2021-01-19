package Task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // Вводить последовательность чисел до тех пор, пока их сумма не достигнет М(М
        //вводится и больше 0).Ввести, какое количество чисел составили искомую сумму
        //(саму сумму тоже).

        Scanner num = new Scanner(System.in);
        int number;
        System.out.print("Введите значение: ");
        number = num.nextInt();                 // значение которое вводит пользователь

        int sum =0;
        int  i = 0; //количество числе которое состовляло сумму

        while (number>sum){

            System.out.print("Введите значение: ");
            int t = num.nextInt();
            sum = sum+t;
            i++;
        }
        System.out.println("Количество чисел" + i);
    }
}
