package homework;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {2, 32, 1, 42, 64, 5, 24, 8, 6};
        int x = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    x = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = x;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
