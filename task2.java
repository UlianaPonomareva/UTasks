import java.util.Scanner;

// Проверить, можно ли вписать в треугольник со сторонами A, B, C круг с радиусом R (заодно проверить возможность существования этого треугольника)
public class task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите сторону A: ");
            double a = scanner.nextDouble();
            if (a <= 0) {
                System.out.println("Ошибка: стороны должны быть строго положительными числами.");
                return;
            }

            System.out.print("Введите сторону B: ");
            double b = scanner.nextDouble();
            if (b <= 0) {
                System.out.println("Ошибка: стороны должны быть строго положительными числами.");
                return;
            }

            System.out.print("Введите сторону C: ");
            double c = scanner.nextDouble();
            if (c <= 0) {
                System.out.println("Ошибка: стороны должны быть строго положительными числами.");
                return;
            }

            System.out.print("Введите радиус R: ");
            double R = scanner.nextDouble();
            if (R <= 0) {
                System.out.println("Ошибка: радиус должен быть строго положительным числом.");
                return;
            }

            boolean isCorrect = isCorrect(a, b, c);
            if (!isCorrect) {
                return;
            }

            double p = (a + b + c) / 2; // полупериметр
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // формула Герона

            double r = S / p; // максимальный радиус вписанной окружности

            System.out.printf("Максимальный радиус вписанной окружности: %.0f%n", r);
            if (r >= R) {
                System.out.println("Да, круг радиуса " + R + " можно вписать в этот треугольник.");
            } else {
                System.out.println("Нет, круг радиуса " + R + " нельзя вписать: максимальный радиус вписанной окружности равен " + String.format("%.2f", r));
            }
        }
    }

    public static boolean isCorrect(double a, double b, double c) {
        if (a >= b + c) {
            System.out.println("Треугольник не существует — сторона A (" + a + ") больше или равна сумме сторон B и C (" + (b + c) + ").");
            return false;
        }
        if (b >= a + c) {
            System.out.println("Треугольник не существует — сторона B (" + b + ") больше или равна сумме сторон A и C (" + (a + c) + ").");
            return false;
        }
        if (c >= a + b) {
            System.out.println("Треугольник не существует — сторона C (" + c + ") больше или равна сумме сторон A и B (" + (a + b) + ").");
            return false;
        }
        return true; // <-- раньше здесь стояло return false, из-за чего всё ломалось
    }
}