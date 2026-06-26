package ru.aston.hometask.task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class Task2 {

    static void showResultFromTask2() throws IOException{
        ObjectMapper mapper = new ObjectMapper();

        List<Student> students = mapper.readValue(Paths.get("resources\\Data.json")
                .toFile(), mapper.getTypeFactory().constructCollectionType(List.class, Student.class));

        students.stream()
                .peek(System.out::println)
                .flatMap(c -> c.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(a -> a.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Release year: " + year),
                        () -> System.out.println("Book does not found")
                );
    }

    public static void main(String[] args) throws IOException {
        Task2.showResultFromTask2();
    }

}