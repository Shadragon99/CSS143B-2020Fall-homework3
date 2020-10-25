package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;




    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        if (capacity > 0){
            data = (T[]) new Integer[capacity];

        }
        size = 0;
    }

    @Override
    public boolean push(T val) {
        if(data == null || data.length == 0 || size == data.length-1){
            return false;
        }
        data[size] = val;
        size ++;

        return true;
    }

    @Override
    public T pop() {
        if(size == 0){
            return null;
        }
        T value = data[size];
        size--;

        return value;
    }

    @Override
    public T peek() {/*
        if(size == 0){
            return;
        }
        */

        return data[size];
    }

    @Override
    public int size() {
        return size;
    }
}
