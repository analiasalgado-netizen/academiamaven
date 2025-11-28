package com.acamediamaven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OnSiteCourseTest {

    @Test

    public void AsignarAula() {
        OnSiteCourse osc = new OnSiteCourse("Java", 2, 103, 10);
        assertEquals(103, osc.room);
        assertEquals(10, osc.maxquota);
    }

    @Test
    public void testOnSiteCourseNotNull() {
        OnSiteCourse oc = new OnSiteCourse("Java", 40, 12, 30);

        assertNotNull(oc);
    }

    @Test
    public void testShowInformationOnSiteCourse() {
        OnSiteCourse oc = new OnSiteCourse("Math", 10, 23, 40);

        String expected = "Course: Math\n"
                + "Duration: 10 hours\n"
                + "Professor: unassigned\n"
                + "Room: 23\n"
                + "Max quota: 40";

        assertEquals(expected, oc.showInformation());
    }

}
