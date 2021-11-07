package homework.Bracechecker;

public class Stack {

    private char[] array = new char[50];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(char value) {
        if (size == array.length) {

        } else {
            array[++size] = value;
        }
    }

    public char pop() {
        if (size < 0) {

            return 0;
        } else {
            return array[size--];
        }
    }

}
