package homework.Bracechecker;

import homework.dynamicArray.DynamicArray;

public class Stack {

    private char[] array = new char[10];
    private int size;
    DynamicArray dynamicArray = new DynamicArray();

    private void add(int valeum) {
        if (size == array.length) {
            dynamicArray.extend();
        }
        array[size++] = (char) valeum;
    }

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

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;

    }
}
