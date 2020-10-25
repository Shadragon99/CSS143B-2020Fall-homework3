package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
    }

    @Override
    public boolean push(T val) {

        return false;
    }

    @Override
    public T pop() {
        if(data.size() == 0){
            return null;
        }
        T val = data.getLast();
        data.removeLast();
        return val;

    }

    @Override
    public T peek() {
        if (data.size() <= 0 ){
            return null;
        }

        return data.getLast();

    }

    @Override
    public int size() {
        return data.size();
    }
}
