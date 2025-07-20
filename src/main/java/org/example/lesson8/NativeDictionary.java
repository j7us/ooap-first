package org.example.lesson8;

public abstract class NativeDictionary<T> {

    public NativeDictionary() {}

    // Команды

    // постусловие: элемент добавлен в таблице по ключу key
    public abstract void put(String key, T value);

    // предусловие: элемент присутствует в таблице
    // постусловие: элемент удален из таблицы вместе с ключом
    public abstract void remove(String key);

    // Запросы

    // предусловие: ключ присутствует в таблице
    public abstract T get(String key);

    public abstract boolean isKey(String key);
    public abstract int size();

    public abstract int getRemoveStatus();
    public abstract int getGetStatus();
}
