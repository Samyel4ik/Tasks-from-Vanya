package Task4;

public class For2 {
    public static void main(String[] args) {
        //Построить таблицу значений для функции f(x) = 2x + 5 на отрезке (-10;20) шагом в 3
        int a = -10;// мин значение отрезка
        int b = 20;//макс значение отрезка
        int x;// функция
        int i;// отрезок
        int h = 3; // шаг

        for (i = a; i <= b; i = i + h) {
            if (i < 0) {
                x = 2 * i + 5;
                System.out.println("Значение отрезка:" + i + " Значение Х на данном отрезке:" + x);
            }
            if (i > 0) {
                x = 2 * i + 5;
                System.out.println("Значение отрезка:" + i + " Значение Х на данном отрезке:" + x);
            }
        }
    }
}
