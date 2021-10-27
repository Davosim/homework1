package homework.ArrayUtill;

public class ArrayUtill {
    void arrayUtillMasiv(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    int arrayUtillMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int arrayUtillMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    int arrayUtillPair(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    int arrayUtillOdd(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }

        }
        return count;
    }

    void arrayUtillPairOfElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
    }

    void arrayUtillOddElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }

    }

    int arrayUtillAmount(int[] array) {
        int l = 0;
        for (int i = 0; i < array.length; i++) {
            l = l + array[i];
        }
        return l;
    }

    int arrayUtillMeanArithmetic(int[] array) {
        int l = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            l = l + array[i];
            k = l / array.length;
        }
        return k;
    }
}