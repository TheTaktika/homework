package ru.aston.hometask;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
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

        int year = students.stream()
                .flatMap(c -> c.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(a -> a.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .orElseThrow(() -> new AssertionError("does not find book"));
        assertEquals(2009, year, "should be equal to 2009");
    }
}
