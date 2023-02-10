package oop.lifo;

import java.util.ArrayList;
import java.util.List;

public class Lifo {

    private List<Integer> stack = new ArrayList<>();

    public List<Integer> getStack() {
        return this.stack;
    }

    public void push(Integer item) {
        this.stack.add(item);
    }

    public Integer pop() {
        return stack.remove(lastIndex());
    }

    public Integer peek() {
        return stack.get(lastIndex());
    }

    private int lastIndex() {
        return stack.size() - 1;
    }
}
