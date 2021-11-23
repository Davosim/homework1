package homework.author;

public class BookStorage {
    static final AuthorStorage authorStorage = new AuthorStorage();

    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == array.length) {
            extend();
        }
        array[size++] = book;

    }

    public void extend() {
        Book[] newArray = new Book[array.length + 10];

        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void searchBook(String title) {
        for (int i = 0; i < size; i++) {
            if (array[i].getTitle().contains(title)) {
                System.out.println(array[i]);
            }

        }
    }

    public void searchByEmail(String email) {
        boolean isfind = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getauthor().getEmail().equalsIgnoreCase(email)) {
                isfind = true;
                System.out.println(array[i]);
            }
        }
        if (isfind = false) System.out.println("asd");
    }


    public void countBookAuthor(String email) {
        boolean countAuthor = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getauthor().getEmail().equalsIgnoreCase(email)) {
                countAuthor = true;
                System.out.println(array[i].getCount());
            }
        }
        if (countAuthor = false) System.out.println("asd");

    }

    public void changeBook(String title, String email) {
        boolean changeAuthor = false;
        Book book=null;
        for (int i = 0; i < size; i++) {
            if (array[i].getTitle().equalsIgnoreCase(title)) {
                book=array[i];
                book.setAuthor(authorStorage.serchByEmail(email));
                changeAuthor = true;
            }


            }
            if (changeAuthor = false) System.out.println("asd");





    }
}
