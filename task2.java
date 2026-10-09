import java.util.Scanner;
//Проверить, можно ли вписать в треугольник со сторонами А, В, С круг с радиусом R, (заодно проверить возможность существования этого треугольника)
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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
        
        System. out.print("Введите сторону С: ");
        double c= scanner.nextDouble();
        if (c <= 0) {
            System.out.println("Ошибка: стороны должны быть строго положительными числами.");
            return;
        }
        
        System.out.print("Введите радиус R: ");
        double R= scanner.nextDouble();
        if (R <= 0) {
            System.out.println("Ошибка: радиус должен быть строго положительными числами. ");
            return;
        }
        
        boolean D = iscorekt(a, b, c);
        if (!D) {
            return;
        }
        double p = (a + b + c) / 2; //полупиреметр
        double S = Math.sqrt((p - a) * (p - b) * (p - c)); // формула герона
        
        double r = S / p; //расчет радиуса котоорый подойдет для заданного треуголльника
        
        System.out.printf("Максимальный радиус вписанной окружности для заданого треугольника: %.1f%n", r);
        if (r >= R) {
            System.out.println("Да, круг радиуса " + R + " можно вписать в этот треугольник. ");
        } else {
             System.out.println("Нет, круг радиуса " + R + " нельзя вписать: максимальный радиус вписанной окружности равен " + r);
        }
    }
    
    public static boolean iscorekt(double a, double b, double c) {
        if (a >= b + c) {
            System.out.println("Треугольник не существует - сторона А (" + а + ") не меньше суммы В и С (" + (b + с) + ") .");
            return false;
            }
            
        if (b >= a + c) {
            System.out.println("Треугольник не существует - сторона В (" + b + ") не меньше сунны А и С (" + (а + с) + "). ");
            return false;
            }
        if (c >= a +b) {
                System.out.println("Треугольник не существует - сторона С (" + с + ") не меньше суммы А и В (" + (а + b) + ").");
                return false;
            }
    }