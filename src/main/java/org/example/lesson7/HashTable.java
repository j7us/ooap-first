package org.example.lesson7;

public abstract class HashTable<T> {

    public HashTable(Integer size) {}

    // Команды

    // предусловие: есть возможность добавить новый элемент с учетом коллизий
    // постусловие: добавлен новый элемент
    public abstract void put(T element);

    // предусловие: элемент присутствует в таблице
    // постусловие: элемент удален
    public abstract void remove(T element);

    // Запросы

    // предусловие: элемент присутствует в таблице
    public abstract T find(T element);

    public abstract int size();

    public abstract int getPutStatus();
    public abstract int getRemoveStatus();
    public abstract int getFindStatus();
}
