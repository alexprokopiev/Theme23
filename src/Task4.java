import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        // Вычислить сумму 1 + 1/2 + 1/3 + ... + 1/n
        System.out.println("Введите целое положительное число:");
        Scanner sc = new Scanner(System.in);
        int number = 0;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            if (number < 1) {
                inputError("Требуется ввести целое положительное число");
            }
        } else {
            inputError("Требуется ввести целое положительное число");
        }
        sc.close();

        double result = 0;
        for (int i = 1;i < number;i++) {
            result += (double) 1 /i;
        }
        System.out.println("Результат вычисления:"+result);
    }

    public static void inputError (String message) {
        // Обработка ошибки ввода данных
        System.out.println(message);
        System.exit(0);
    }
}
