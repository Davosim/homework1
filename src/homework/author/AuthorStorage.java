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

        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }


    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println();

        } else return array[index];

        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }


    public void searchAuthor(String keyword) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().contains(keyword) || array[i].getSurname().contains(keyword)) {
                System.out.println(array[i]);
            }

        }
    }


    public void searchAuthorByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAge() >= minAge && array[i].getAge() <= maxAge) {

                System.out.println(array[i]);
            }
        }
    }
}
