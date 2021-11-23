package homework.author;

public class AuthorStorage {


    private static Author[] array = new Author[10];
    static int size = 0;

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


    public Author searchAuthor(String name, String srname) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equalsIgnoreCase(name) || array[i].getSurname().equalsIgnoreCase(srname)) {
                return array[i];
            }
            System.out.println("we dont have such an author");
        }
        return null;
    }


    public void searchAuthorByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAge() >= minAge && array[i].getAge() <= maxAge) {

                System.out.println(array[i]);
            }
        }
    }

    public Author serchByEmail(String email) {
        Author author = null;
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equalsIgnoreCase(email)) {
                author = array[i];
            }

        }
        return author;
    }

    public void autorChange(String email, String name, String surname) {

        boolean emailCom = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equalsIgnoreCase(email)) {
                emailCom = true;
                array[i].setName(name);
                array[i].setSurname(surname);
            }
        }
        if (emailCom = false) System.out.println("asd");

    }

}

