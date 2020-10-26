package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    private int size;
    ArrayStack auxStack = new ArrayStack(size);

    public MinStack(int size) {

        super(size);
    }

    @Override
    public boolean push(Integer val) {

        super.push(val);
        if(auxStack == null || auxStack.size() == 0 || size == auxStack.size()){
            return false;
        }
        auxStack.push(val);
        size ++;

        return false;
    }

    @Override
    public Integer pop() {
        if(auxStack.size() == 0){
            return null;
        }
        size--;
        return super.pop();
    }

    public Integer getMin() {

        return (Integer) auxStack.peek();

    }
}

