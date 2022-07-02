package Task3;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {14, 3, 9, 4, 12, 27, 7, 13, 81};
        for (int j : array) {
            if (j % 3 == 0)
                System.out.print(j + " ");
        }
    }
}
