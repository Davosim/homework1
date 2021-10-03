public class Example {
    public static void main(String[] args) {
        System.out.print("Start");
        for (int i = 0; i < 12; i++) {
            if (i <= 10)
                System.out.println(i);
            else {
                System.out.println("Finish");
            }
        }
    }
}
