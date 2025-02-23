import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Проверка числа
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Hello");
        }

        scanner.nextLine();

        // 2. Проверка имени
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        if (name.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        // 3. Числа, кратные 3
        System.out.print("Введите числа через пробел: ");
        String line = scanner.nextLine();
        String[] parts = line.split(" ");

        System.out.println("Числа, кратные 3:");
        for (int i = 0; i < parts.length; i++) {
            int num = Integer.parseInt(parts[i]);
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}