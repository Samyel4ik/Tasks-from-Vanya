package Task7;

public class For5 {
    public static void main(String[] args) {

        for (int i = 4; i >= 0; i--) {   // количество строк номер строки

            for (int j = 0; j <= i; j++) { // наполнение стоки количество цифр

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
