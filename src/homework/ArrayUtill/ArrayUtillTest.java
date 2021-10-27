package homework.ArrayUtill;

import homework.ArraySort1.ArraySort1;

public class ArrayUtillTest {
    public static void main(String[] args) {
        ArrayUtill arrayUtill = new ArrayUtill();
        int[] array = {5, 4, 6, 2, 3, 11};
        arrayUtill.arrayUtillMasiv(array);
        System.out.println();
        int max = arrayUtill.arrayUtillMax(array);
        System.out.println("max=" + max);
        int min = arrayUtill.arrayUtillMin(array);
        System.out.println("min=" + min);
        int pair = arrayUtill.arrayUtillPair(array);
        System.out.println("pair=" + pair);
        int odd = arrayUtill.arrayUtillOdd(array);
        System.out.println("odd=" + odd);
        System.out.print("Pair of elements=");
        arrayUtill.arrayUtillPairOfElements(array);
        System.out.println();
        System.out.print("Odd elements=");
        arrayUtill.arrayUtillOddElements(array);
        int amount = arrayUtill.arrayUtillAmount(array);
        System.out.println();
        System.out.println("amount=" + amount);
        int MeanArithmetic = arrayUtill.arrayUtillMeanArithmetic(array);
        System.out.println("MeanArithmetic=" + MeanArithmetic);



    }
}
