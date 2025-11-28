
package com.acamediamaven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OnlineCourseTest {

    @Test
    public void AsignarPlataforma() {
        OnlineCourse oc = new OnlineCourse("Java", 2, "Moodle");
        assertEquals("Moodle", oc.getPlatform());
    }

    @Test
    public void testPlatformNotEqualsWrongValue() {
        OnlineCourse oc = new OnlineCourse("Java", 2, "Moodle");
        assertNotEquals("Google Classroom", oc.getPlatform());
    }

    @Test
    public void testShowInformationOnlineCourse() {
        OnlineCourse oc = new OnlineCourse("Java", 2, "Moodle");

        String expected = "Course: Java\n"
                + "Duration: 2 hours\n"
                + "Professor: unassigned\n"
                + "Platform: Moodle";

        String result = oc.showInformation();

        assertEquals(expected, result);
    }

}
