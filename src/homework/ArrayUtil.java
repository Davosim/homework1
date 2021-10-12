package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {41, 5, 62, 10, 11, 7, 65, 30, 50, 23};
        int x = array[0];
        int y = array[0];
        int j = 0;
        int f = 0;
        int l = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

            if (array[i] > x) {
                x = array[i];
            }
            if (array[i] < y) {
                y = array[i];
            }
            if (array[i] % 2 == 0) {
                j++;
            }
            if (array[i] % 2 != 0) {
                f++;
            }
        }
        System.out.println();
        System.out.println("Ամենամեծ թիվը-" + x);
        System.out.println("Ամենափոքրը թիվը-" + y);
        System.out.println("Զույգերի քանակը-" + j);
        System.out.println("Կենտերի քանակը-" + f);

        System.out.print("Զույգ էլեմենտները-");
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Կենտ էլեմենտները-");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            l = l + array[i];
            k = l / array.length;
        }
        System.out.println();
        System.out.println("էլեմենտների գումարը-" + l);
        System.out.println("միջին թվաբանականը-" + k);

    }
}
