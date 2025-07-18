package org.example.lesson6;

public abstract class ParentQueue<T> {

    // Конструктор

    public ParentQueue() {}

    // Команды

    // постусловие: элемент добавлен в хвост очереди.
    public abstract void addTail(T element);

    // предусловие: очередь не пустая
    // постусловие: из головы очереди взят элемент
    public abstract T removeFront();


    // Запросы

    // предусловие: очередь не пустая
    public abstract T peekFront();

    public abstract int size();

    public abstract int getRemoveFrontStatus();
    public abstract int getPeekFrontStatus();
}

abstract class Queue<T> extends ParentQueue<T> {
    public Queue() {}
}

abstract class Deque<T> extends ParentQueue<T> {
    public Deque() {}

    // Команды

    // постусловие: элемент добавлен в начало очереди.
    public abstract void addFront(T element);

    // предусловие: очередь не пустая
    // постусловие: из хвоста очереди взят элемент
    public abstract T removeTail();

    // Запросы

    // предусловие: очередь не пустая
    public abstract T peekTail();

    public abstract int getRemoveTailStatus();
    public abstract int getPeekTailStatus();
}
