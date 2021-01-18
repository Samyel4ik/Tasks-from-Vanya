package Task3;

public class For1 {
    public static void main(String[] args) {
        //Построить таблицу значений для функции f(x) = 4x^2 + 3x + 5 на отрезке [-5;15] шагом в 2
        int h = 2; //шаг
        int a = -5; // начало отрезка
        int b = 15;//конец отрезка
        double x; // фунция
        int i; //отрезок
        int z = 2; //степень

        for (i = a; i <= b; i = i + h) {
            //System.out.println(i);
            if (i < 0) {
                x = 4 * Math.pow(i, z) + 3 * i + 5;
                System.out.println("Значение отрезка:" + i + " Значение Х на данном отрезке:" + x);
            }
            if (i > 0) {
                x = 4 * Math.pow(i, z) + 3 * i + 5;
                System.out.println("Значение отрезка:" + i + " Значение Х на данном отрезке:" + x);
            }
            //System.out.println("Значение отрезка:" + i + " Значение Х на данном отрезке:" + x );
        }
    }
}
