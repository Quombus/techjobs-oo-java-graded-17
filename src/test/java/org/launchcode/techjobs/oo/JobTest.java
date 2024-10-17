package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1, testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob1.getLocation() instanceof Location);
        assertTrue(testJob1 instanceof Job);

        assertEquals(testJob1.getEmployer().getValue(), "ACME");
        assertEquals(testJob1.getPositionType().getValue(), "Quality control");
        assertEquals(testJob1.getLocation().getValue(), "Desert");
        assertEquals(testJob1.getCoreCompetency().getValue(), "Persistence");
        assertEquals(testJob1.getName(), "Product tester");
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(testJob1, testJob2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(lineSeparator(), testJob1.toString().charAt(0));
        assertEquals(lineSeparator(), testJob1.toString().charAt(testJob1.toString().length() - 1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String id = Integer.toString(testJob1.getId());
        String name = testJob1.getName();
        String employer = testJob1.getEmployer().toString();
        String location = testJob1.getLocation().toString();
        String position = testJob1.getPositionType().toString();
        String competency = testJob1.getCoreCompetency().toString();

        assertEquals(testJob1.toString(), lineSeparator() +
                "ID: " + id + lineSeparator()
                + "Name: " + name + lineSeparator() +
                "Employer: " + employer +lineSeparator() +
                "Location: " + location + lineSeparator() +
                "Position Type: " + position + lineSeparator() +
                "Core Competency: " + competency + lineSeparator());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        String id = Integer.toString(testJob1.getId());
        String name = testJob1.getName();
        String employer = "Data not available";
        String location = testJob1.getLocation().toString();
        String position = testJob1.getPositionType().toString();
        String competency = testJob1.getCoreCompetency().toString();

        assertEquals(testJob1.toString(), lineSeparator() +
                "ID: " + id + lineSeparator()
                + "Name: " + name + lineSeparator() +
                "Employer: " + employer +lineSeparator() +
                "Location: " + location + lineSeparator() +
                "Position Type: " + position + lineSeparator() +
                "Core Competency: " + competency + lineSeparator());

    }
    }


