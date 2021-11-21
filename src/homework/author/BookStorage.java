package homework.author;

public class BookStorage {

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
}
