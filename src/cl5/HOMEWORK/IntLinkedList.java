package cl5.HOMEWORK;

import java.util.Arrays;

public class IntLinkedList implements IntList {

    private class Element {
        int value;
        Element previous;
        Element next;

        Element(int value) {
            this.value = value;
        }
    }

    private int size = 0;
    private Element first;
    private Element last;

    @Override
    public void add(int value) {
        Element newElement = new Element(value);
        if (size == 0) {
            first = newElement;
        } else {
            last.next = newElement  ;
            newElement.previous = last;
        }
        last = newElement;
        size++;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean contains(int value)
    {
        return indexOf(value) != -1;
    }

    @Override
    public int get(int index) {
        checkIndexRange(index);
        return getElementAtIndex(index).value;
    }

    @Override
    public void set(int index, int value) {
        checkIndexRange(index);
        getElementAtIndex(index).value = value;
    }


    @Override
    public void add(int index, int value) {
        checkIndexRange(index);
        Element newElement = new Element(value);
        if (index == 0) {
            first.previous = newElement;
            newElement.next = first;
            first = newElement;
        } else {
            Element right = getElementAtIndex(index);
            Element left = right.previous;
            left.next = newElement;
            newElement.previous = left;
            right.previous = newElement;
            newElement.next = right;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        checkIndexRange(index);
        if (size == 1) {
            first = null;
            last = null;
        } else if (index == 0) {
            first = first.next;
            first.previous = null;
        } else if (index == size - 1) {
            last = last.previous;
            last.next = null;
        } else {
            Element tmp = getElementAtIndex(index);
            Element left = tmp.previous;
            Element right = tmp.next;
            left.next = right;
            right.previous = left;
        }
        size--;
    }

    @Override
    public int indexOf(int value) {
        int index = 0;
        Element tmp = first;
        while (tmp != null) {
            if (tmp.value == value) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    private int[] toArray() {
        int[] arr = new int[size];
        int index = 0;
        Element tmp = first;
        while (tmp != null) {
            arr[index++] = tmp.value;
            tmp = tmp.next;
        }
        return arr;
    }

    private Element getElementAtIndex(int index) {
        Element tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    private void checkIndexRange(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("....");
        }
    }

}
