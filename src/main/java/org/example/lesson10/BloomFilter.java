package org.example.lesson10;

public abstract class BloomFilter<T> {

    public BloomFilter(Integer size) {}

    // команды
    // постусловие: элемент помешен в фильтр
    abstract void put(T element);

    // запросы

    abstract boolean iaValue(T element);
}
