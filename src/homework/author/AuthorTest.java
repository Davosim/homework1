package homework.author;

import java.util.Scanner;

public class AuthorTest {


    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();
    public static final String EXIT = "0";
    public static final String ADD_AUTHOR = "1";
    public static final String SEARCH_AUTHOR = "2";
    public static final String SEARCH_AUTHOR_BY_AGE = "3";
    public static final String PRINT_AUTOR = "4";

    public static void main(String[] args) {
        authorStorage.add(new Author("poxos", "poxosyan", "poxos@mail.ru", 21, "male"));
        authorStorage.add(new Author("petros", "petrosyan", "petros@mail.ru", 32, "male"));


        boolean isRan = true;
        while (isRan) {
            printCommands();

            String comand = scanner.nextLine();

            switch (comand) {
                case EXIT:
                    isRan = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHOR:
                    searchAuthor();
                    break;
                case SEARCH_AUTHOR_BY_AGE:
                    searchAuthorByAge();
                    break;
                case PRINT_AUTOR:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }


        System.out.println("Author?");

        int count = Integer.parseInt(scanner.next());


    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("Please input " + SEARCH_AUTHOR + " for SEARCH_AUTHOR");
        System.out.println("Please input " + SEARCH_AUTHOR_BY_AGE + " for SEARCH_AUTHOR_BY_AGE");
        System.out.println("Please input " + PRINT_AUTOR + " for PRINT_AUTOR");
    }

    private static void searchAuthorByAge() {
        System.out.println("Please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchAuthorByAge(minAge, maxAge);
    }

    private static void searchAuthor() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchAuthor(keyword);
    }

    private static void addAuthor() {
        System.out.println("Name-");
        String name = scanner.nextLine();
        System.out.println("Surname-");
        String surname = scanner.nextLine();
        System.out.println("Email-");
        String email = scanner.nextLine();
        System.out.println("Age-");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Gender");
        String gender = scanner.nextLine();
        Author author = new Author(name, surname, email, age, gender);
        authorStorage.add(author);
        System.out.println("Thank you! Author was added");
    }
}

