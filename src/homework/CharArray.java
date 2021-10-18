package homework;

public class CharArray {
    public static void main(String[] args) {

//        1)
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int x = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                x++;
            }
        }
        System.out.println("o-երի քանակը " + x);

//        2)
        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};

        char c1 = bolola1[bolola1.length / 2];
        char c2 = bolola1[bolola1.length / 2 - 1];
        System.out.println(c1 + " " + c2);
//
//        3)
        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};

        if (bolola2[bolola2.length - 1] == 'y' && bolola2[bolola2.length - 2] == 'l')
            System.out.println(true);
        else {
            System.out.println(false);
//
//            4)
            char[] bolola3 = {'b', 'o', 'l', 'o', 'l', 'a'};
            boolean bob=false;
            for (int i = 0; i < bolola3.length; i++) {
                if (bolola3[i] == 'b' && bolola3[i + 2] == 'b') {
                    bolola3[i]++;
                    bob=true;
                }
            }
            System.out.println(bob);
//
//            5)
            int start = 0;
            int end = 0;
            char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
            for (int i = 0; i < text.length; i++) {
                if (text[i] != ' ') {
                    start = i;
                    break;
                }
            }
            for (int i = text.length - 1; i > 0; i--) {
                if (text[i] != ' ') {
                    end = i;
                    break;
                }
            }

            char[] result = new char[end - start + 1];
            for (int i = 0; i < result.length; i++) {
                result[i] = text[start];
                start++;
                System.out.print(result[i]);
            }
        }
    }
}

