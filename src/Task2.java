public class Task2 {

    public static void main(String[] args) {

        // Напечатать числа следующим образом:
        // 25 25.5 24.8
        // 26 26.5 25.8
        // ...
        // 35 35.5 34.8

        int number = 25;
         do {
            System.out.println(number+" "+number+".5 "+(number-1)+".8");
        } while (number++ < 35);
    }
}
