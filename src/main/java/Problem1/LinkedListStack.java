package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val) {
        LinkedList<T> n = new LinkedList<T>();
        if (n == null){
            return false;
        }


        return false;
    }

    @Override
    public T pop() {
        if(data.size() == 0){
            return null;
        }
        T val = data.getFirst();
        data.removeFirst();
        return val;

    }

    @Override
    public T peek() {
        if (data.size() <= 0 ){
            return null;
        }

        return data.getFirst();

    }

    @Override
    public int size() {
        return data.size();
    }
}
