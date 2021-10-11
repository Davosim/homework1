package masiv;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Cпpaвкa по оператору:");
            System.out.println(" 1.Հայ");
            System.out.println(" 2.Рус");
            System.out.println(" 3.Eng");
            System.out.println("Bыбepитe нужный пункт:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '3');
        System.out.println("/n");
        switch (choice) {
            case '1':
                System.out.println("Հայ: \n");
                System.out.println("Հայ(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Рус: \n");
                System.out.println("Рус(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '3':
                System.out.println("Eng: \n");
                System.out.println("Eng(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
        }
    }
}