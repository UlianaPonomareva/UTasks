import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Просим ввести нечётное число s >= 1
        System.out.print("Введите НЕЧЕТНОЕ число s: ");
        int s = scanner.nextInt();

        if (s < 1 || s % 2 == 0) {
            System.out.println("Нужно нечётное число больше нуля, балда !!!!");
            return;
        }

        int mid = s / 2;   // середина (для отступов)

        for (int i = 0; i <= mid; i++) {
            for (int space = 0; space < mid - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int space = 0; space < mid - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
