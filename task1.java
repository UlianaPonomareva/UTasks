import java. util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Введите сторону а: ");
    int a;
    a = scanner.nextInt();
    if (a > 0) {
        System.out.println(a);
    } else {
        System. out.println("Не подходит!");
}
      
    System.out.print("Введите одну сторону b: ");
    int b;
    b = scanner.nextInt();
    if (b > 0) {
        System.out.println(b);
    } else {
        System. out. println("Не подходит!");
    return;
    }
    
    int S;
    S = (a * b) / 2;
    System. out.println("Площадь прямоугольного треугольника " + S);
    {
        System.out.println("Длины сторон должны быть положительными числами. ");
}
double c = Math.sqrt(a*a + b*b);
System.out.println(" Гипотенуза (с) = " + c);
double P = (a + b + c);
System.out.println("Периметр треугольника равен " + P);
}