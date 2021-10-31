package homework.PracticeHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();

        int seconds = practiceHomework.longConvert(2);
        System.out.println("2 minute=" + seconds + " seconds");
        int years = practiceHomework.calcAge(3);
        System.out.println("3 years=" + years + " day");
        int nextNumber = practiceHomework.nextNumber(5);
        System.out.println(nextNumber);
        boolean isSume = practiceHomework.isSameNum(6, 8);
        System.out.println(isSume);
        boolean toZero = practiceHomework.lessThanOrEqualToZero(-20);
        System.out.println(toZero);
        boolean bool = practiceHomework.reverseBool(true);
        System.out.println(bool);
        int[] array1 = {5, 4, 6, 2, 12, 32, 15};
        int[] array2 = {12, 32, 2, 4, 5, 62, 1, 3, 2};
        int maxLength = practiceHomework.maxLength(array1, array2);
        System.out.println(maxLength);
    }
}