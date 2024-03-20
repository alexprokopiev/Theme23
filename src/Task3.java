public class Task3 {

    public static void main(String[] args) {

        // Напечатать таблицу соответствия между весом в фунтах и весом в килограммах
        // для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).

        int weight = 1;
        do {
            System.out.println(weight+" фунт = "+(453*weight)+" г");
        } while (weight++ < 10);
    }
}
