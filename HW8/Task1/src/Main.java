public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            //#2 Распечатать все значения массива начиная с 0 до последнего индексов
            System.out.println(arr[i]);
        }
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }

    }
}
