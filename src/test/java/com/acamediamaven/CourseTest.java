package com.acamediamaven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CourseTest {

    // Con profesor definido
    @Test
    public void testConstructorCompleto() {
        Course c = new Course("Mathematics", 40, "Dr. Smith");

        assertEquals("Mathematics", c.getTitle());
        assertEquals(40, c.getduration());
        assertEquals("Dr. Smith", c.getProfessor());

    }

    // Sin profesor definido
    @Test
    public void testConstructorSinProfesor() {
        Course c = new Course("Physics", 60);

        assertEquals("Physics", c.getTitle());
        assertEquals("unassigned", c.getProfessor());
        

    }
    @Test
    public void testConstructorTiempoClase() {
        Course c = new Course("Phyton", 8);

        assertTrue(c.getduration() > 0);
    }

    @Test
    public void testShowInformationCourse() {
        Course course = new Course("Java", 2);

        String expected = "Course: Java\n" +
                "Duration: 2 hours\n" +
                "Professor: null";

        String result = course.showInformation();

        assertEquals(expected, result);
    }

}
