package Task6;

public class For4 {
    public static void main(String[] args) {
        // вывести теругольник из едениц
        int x = 1;

        for (int i = 5; i > 0; i--) {  //количество строка

            for (int j = 1; j <= i; j++) { // наполнение строки

                System.out.print(x + " ");

            }
            System.out.println();
        }
    }
}
