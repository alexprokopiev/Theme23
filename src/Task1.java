import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Составить программу вывода любого числа любое заданное число раз.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число:");
        int number = 0;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            inputError("Требуется ввести целое число");
        }
        System.out.println("Введите количество повторений числа при выводе:");
        int counter = 0;
        if (sc.hasNextInt()) {
            counter = sc.nextInt();
            if (counter < 1) {
                inputError("Требуется ввести целое положительное число");
            }
        } else {
            inputError("Требуется ввести целое положительное число");
        }
        sc.close();

        int i = 0;
        while (i++ < counter) {
            System.out.println(number);
        }
    }

    public static void inputError (String message) {
        // Обработка ошибки ввода данных
        System.out.println(message);
        System.exit(0);
    }
}
