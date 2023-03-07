import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {2, 3, 1, 7, 11};
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.println("Task №1: "+array[i]);
        }

        int[] arra = {-3, -2, -1, 1, 5};
        int sum = 0;
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] > 0) {
                sum = sum + arra[i];
            }
        }
        System.out.println("Task №2: "+sum);


        int[] numbers = {8, 2, 6, 4};
        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
        }
        double average = (double) sum1 / numbers.length;

        System.out.println("Task №3: " + average);

        int[] arr = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
                System.out.println("Task №4: "+Arrays.toString(arr));
            }
        }
    }
}