package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива:");
        int[] array = new int[Integer.parseInt(reader.readLine())];// = {14, 3, 9, 4, 12, 27, 7, 13, 81};
        System.out.println("Введите целочисленные значения массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Введённый массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Элементы массива кратные 3: ");
        for (int j : array) {
            if (j % 3 == 0)
                System.out.print(j + " ");
        }
    }
}
