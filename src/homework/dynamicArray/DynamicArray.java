package homework.dynamicArray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int valeum) {
        if (size == array.length) {
            extend();
        }
        array[size] = valeum;
        size++;


    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        array = newArray;
    }


    public int getByIndex(int index) {
        if (index > array.length) {
            System.out.println();

        } else return array[index];

        return -1;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
                System.out.print(array[i] + " ");
        }
    }
}
