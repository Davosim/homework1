package homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {

        AuthorStorage authorStorage = new AuthorStorage();
        System.out.println("Author?");
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.next());
        for (int i = 0; i < count; i++) {
            System.out.println("Name-");
            String name = scanner.next();
            System.out.println("Surname-");
            String surname = scanner.next();
            System.out.println("Email-");
            String email = scanner.next();
            System.out.println("Age-");
            int age = Integer.parseInt(scanner.next());
            System.out.println("Gender");
            String gender = scanner.next();
            Author author = new Author(name, surname, email, age, gender);
            authorStorage.add(author);
        }
        authorStorage.print();


    }
}

