package org.example.lesson1;

import java.util.LinkedList;
import java.util.List;

public abstract class BoundedStack<T> {

    public final int PUSH_NIL = 0;
    public final int PUSH_OK = 1;
    public final int PUSH_ERR = 2;
    public final int POP_NIL = 0;
    public final int POP_OK = 1;
    public final int POP_ERR = 2;
    public final int PEEK_NIL = 0;
    public final int PEEK_OK = 1;
    public final int PEEK_ERR = 2;

    public BoundedStack(int capacity) {};

    public BoundedStack() {}

    // предусловие: стек не заполнен
    // постусловие: в стек добавлено новое значение
    public abstract void push(T value);

    // предусловие: стек не пустой;
    // постусловие: из стека удалён верхний элемент
    public abstract void pop();

    // постусловие: из стека удалятся все значения
    public abstract void clear();

    // предусловие: стек не пустой
    public abstract T peek();

    public abstract int size();

    public abstract int capacity();

    public abstract int get_push_status();
    public abstract int get_pop_status();
    public abstract int get_peek_status();
}

class BoundedStackImpl extends BoundedStack<Integer> {

    private List<Integer> stack = new LinkedList<>();
    private int capacity = 32;
    private int push_status;
    private int peek_status;
    private int pop_status;

    public BoundedStackImpl(int capacity) {
        this.capacity = capacity;
        clear();
    }

    public BoundedStackImpl() {
        clear();
    }

    @Override
    public void push(Integer value) {
        if (stack.size() == capacity) {
            push_status = PUSH_ERR;
        }

        stack.add(value);
        push_status = PUSH_OK;
    }

    @Override
    public void pop() {
        if (stack.isEmpty()) {
            pop_status = POP_ERR;
        } else {
            pop_status = POP_OK;
            stack.remove(stack.size() - 1);
        }
    }

    @Override
    public Integer peek() {
        Integer result;

        if (stack.isEmpty()) {
            result = 0;
            peek_status = PEEK_ERR;
        } else {
            result = stack.get(stack.size() - 1);
            peek_status = PEEK_OK;
        }

        return result;
    }

    @Override
    public void clear() {
        stack.clear();

        push_status = PUSH_NIL;
        pop_status = POP_NIL;
        peek_status = PEEK_NIL;
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int get_pop_status() {
        return pop_status;
    }

    @Override
    public int get_peek_status() {
        return peek_status;
    }

    @Override
    public int get_push_status() {
        return push_status;
    }
}
