import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Написать программу, которая сгенерирует случайный вес 10 людям в пределах от 40 до 100 кг.(Нужно самостоятельно найти информацию, как генерировать числа в заданном диапазоне).
//
//        Далее вам нужно будет вычислить несколько показателей:
//        1. Средний вес всех людей.
//        2. Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно.
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(61) + 40;
            sum += arr[i];
            if (arr[i] >= 60 && arr[i] <= 80) {
                count++;
            }
        }
        int average = sum / arr.length;
         System.out.println("Средний вес всех людей " + "= " + average);
         System.out.println("Количество людей : " + count);

    }
}
