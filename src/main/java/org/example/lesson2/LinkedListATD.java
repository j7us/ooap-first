package org.example.lesson2;

public abstract class LinkedListATD<T> {

    public final int HEAD_OK = 1;
    public final int HEAD_ERR = 2;

    public final int TAIL_OK = 1;
    public final int TAIL_ERR = 2;

    public final int RIGHT_OK = 1;
    public final int RIGHT_ERR = 2;

    public final int REMOVE_OK = 1;
    public final int REMOVE_ERR = 2;

    public final int ADD_EMPTY_OK = 1;
    public final int ADD_EMPTY_ERR = 2;

    public final int PUT_RIGHT_OK = 1;
    public final int PUT_RIGHT_ERR = 2;

    public final int PUT_LEFT_OK = 1;
    public final int PUT_LEFT_ERR = 2;

    public final int FIND_OK = 1;
    public final int FIND_ERR = 2;

    public final int REMOVE_ALL_OK = 1;
    public final int REMOVE_ALL_ERR = 2;

    public final int REPLACE_OK = 1;
    public final int REPLACE_ERR = 2;

    public LinkedListATD() {}

    //команды

    // предусловие: связный список не пустой;
    // постусловие: курсор установлен на первый элемент в списке
    public abstract void head();

    // предусловие: связный список не пустой;
    // постусловие: курсор установлен на последний элемент в списке
    public abstract void tail();

    // предусловие: связный список не пустой;
    // постусловие: курсор установлен на один узел правее
    public abstract void right();

    // предусловие: связный список пустой;
    // постусловие: добавлен узел справа от текущего
    public abstract void put_right(T value);

    // предусловие: связный список пустой;
    // постусловие: добавлен узел слева от текущего
    public abstract void put_left(T value);

    // предусловие: связный список не пустой;
    // постусловие: текущий узел удален, курсор смешен или не указывает ни на один элемент
    public abstract void remove();

    // постусловие: список пуст
    public abstract void clear();

    // предусловие: связный список пустой;
    // постусловие: добавлен узел в текущий список, курсор указывает на данный узел
    public abstract void add_to_empty(T value);

    // постусловие: добавлен узел в хвост
    public abstract void add_tail(T value);

    // предусловие: связный список не пустой;
    // постусловие: текущее значение в узле заменено на указанное
    public abstract void replace(T value);

    // предусловие: связный список не пустой, указанное значение присутствует;
    // постусловие: курсор указывает на следующий узел по отношению к текущему с нужным значением
    public abstract void find(T value);

    // предусловие: связный список не пустой, указанное значение присутствует;
    // постусловие: все узлы с данным значением удалены
    public abstract void remove_all(T value);

    //запросы

    // предусловие: связный список не пустой
    public abstract void get();

    public abstract void size();

    public abstract void is_head();

    public abstract void is_tail();

    public abstract void is_value();
}

// 2.2
// Операция tail может устанавливать курсор в хвост с помощью указателя на хвост, который может присутствовать в реализации

// 2.3
// Операцию поиска всех узлов можно заменить циклом с методом find();
