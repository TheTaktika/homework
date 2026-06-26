package ru.aston.hometask;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import ru.aston.hometask.task2.Book;
import ru.aston.hometask.task2.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    ObjectMapper mapper = new ObjectMapper();

    @Test
    void shouldLoadStudentsFromJson() throws IOException {
        InputStream is = getClass().getClassLoader().getResourceAsStream("Data.json");
        assertNotNull(is, "File .json not found");

        List<Student> students = mapper.readValue(is, new TypeReference<List<Student>>() {
        });
        assertFalse(students.isEmpty(), "Must not be empty");

        Student first = students.get(0);
        assertEquals("Elizabeth", first.getName());
        assertNotNull(first.getBooks());
        assertFalse(first.getBooks().isEmpty());

        Book firstBook = first.getBooks().get(0);
        assertEquals("One Day in the Life of Ivan Denisovich", firstBook.getTitle());
    }
}
