package org.launchcode.techjobs.oo;

import org.junit.Test;

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
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new PositionType("Quality control"), new Location("Desert"), new CoreCompetency("Persistence"));

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
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new PositionType("Quality control"), new Location("Desert"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new PositionType("Quality control"), new Location("Desert"), new CoreCompetency("Persistence"));
        assertNotEquals(testJob1, testJob2);
    }
}
