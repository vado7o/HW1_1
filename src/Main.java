import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(rnd.nextInt(100));
        }

        System.out.println("Сформированный массив: " + arrayList);
        System.out.println("Среднее арифметическое ЧЁТНЫХ чисел массива: " + new DecimalFormat("#0.00")
                .format(arrayList.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).average().getAsDouble()));
    }
}