package home170707;

import java.util.Arrays;

public class StringArrayList {

    private static final int DEFAULT_SIZE = 2;
    private String[] elements = new String[DEFAULT_SIZE];
    private int size = 0;

    public void add(String string) {

        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = string;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        if (elements.length > 0) {
            result.append(elements[0]);
        }

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] != null) {
                result.append(", ");
                result.append(elements[i]);
            }
        }
        result.append("]");
        return result.toString();
    }

    public void remove(int i) {
        if (i >= size || i < 0) {
            return;
        }

        System.arraycopy(elements, i+1, elements, i, --size - i);
        elements[size] = null;

    }

    public String get(int i) {
        return elements[i];
    }

    public void set(int i, String s) {
        if (i < elements.length) {
            elements[i] = s;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean remove(String value) {
        boolean result = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(value)) {
                remove(i);
                result = true;
                break;
            }
        }

        return result;
    }

}