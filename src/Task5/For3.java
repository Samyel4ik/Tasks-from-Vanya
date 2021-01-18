package Task5;

public class For3 {
    public static void main(String[] args) {
        // вывести 1 2 3 4 и таких 6 столбцов.
        int x = 1;

        for (int i = 1; i <= 4; i++) {   // количество строк номер строки

            for (int j = 1; j <=6; j++) { // наполнение стоки количество цифр

                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
