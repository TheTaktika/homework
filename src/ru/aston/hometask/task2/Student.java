package ru.aston.hometask.task2;

import java.util.List;

public class Student {
    private String name;
    private List<Book> books;

    public Student() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
