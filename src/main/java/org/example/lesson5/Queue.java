package org.example.lesson5;

public abstract class Queue<T> {

    // Конструктор

    public Queue() {}

    // Команды

    // постусловие: элемент добавлен в конец очереди.
    public abstract void enqueue(T element);

    // предусловие: очередь не пустая
    // постусловие: из головы очереди взят элемент
    public abstract T dequeue();


    // Запросы

    // предусловие: очередь не пустая
    public abstract T peek();

    public abstract int size();

    public abstract int getDequeueStatus();
    public abstract int getPeekStatus();
}
