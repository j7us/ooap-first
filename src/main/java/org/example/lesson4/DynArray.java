package org.example.lesson4;

public abstract class DynArray<T> {

    // конструктор
    public DynArray(Integer capacity) {}

    // команды

    // постусловие: добавлен новый элемент в конец массива,
    // если размер текущего массива превышен, выполняется реаллокация
    public abstract void append(T element);

    // предусловие: размер массива соответствует индексу вставки.
    // постусловие: вставлен новый элемент на указанную позицию,
    // если размер текущего массива превышен, выполняется реаллокация
    public abstract void insert(T element, int index);

    // предусловие: размер массива соответствует индексу вставки.
    // постусловие: вставлен новый элемент на указанную позицию,
    // если массив после операции заполнен на определенный процент, то размер массива уменьшается
    public abstract void remove(int index);

    // постусловие: массив пуст.
    public abstract void clear();

    // запросы

    public abstract int size();

    // предусловие: указанный индекс не больше размера массива
    public abstract T getItem(int index);

    public abstract int getInsertStatus();
    public abstract int getRemoveStatus();
    public abstract int getGetItemStatus();
}
