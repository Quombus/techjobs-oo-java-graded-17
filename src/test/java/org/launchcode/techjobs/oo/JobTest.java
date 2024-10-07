package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId () {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1, testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new PositionType("Quality control"), new Location("Desert"), new CoreCompetency("Persistence"));

        assertTrue(testJob1.getEmployer() instanceof  Employer);
        assertTrue(testJob1.getPositionType() instanceof  PositionType);
        assertTrue(testJob1.getCoreCompetency() instanceof  CoreCompetency);
        assertTrue(testJob1.getLocation() instanceof  Location);
        assertTrue(testJob1 instanceof  Job);

        assertEquals(true, "ACME".equals(testJob1.getEmployer()));
        assertEquals(true, "Quality control".equals(testJob1.getPositionType()));
        assertEquals(true, "Desert".equals(testJob1.getLocation()));
        assertEquals(true, "Persistence".equals(testJob1.getCoreCompetency()));
        assertEquals(true, "Product tester".equals(testJob1.getName()));
    }
}
