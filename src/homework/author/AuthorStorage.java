package homework.author;

public class AuthorStorage {


    private Author[] array = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author;

    }

    public void extend() {
        Author[] newArray = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        array = newArray;
    }


    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println();

        } else return array[index];

        return null;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                System.out.print(array[i] + " ");
        }
    }
}
