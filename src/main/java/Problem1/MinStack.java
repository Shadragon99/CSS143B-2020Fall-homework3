package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    //ArrayStack auxStack = new ArrayStack(size);

    public MinStack(int size) {
        // homework
        super(size); // place holder
    }

    @Override
    public boolean push(Integer val) {
        // homework
        super.push(val);

        return false;
    }

    @Override
    public Integer pop() {
        // homework
        return super.pop();
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        //return auxStack.peek();
        return -1;
    }
}

