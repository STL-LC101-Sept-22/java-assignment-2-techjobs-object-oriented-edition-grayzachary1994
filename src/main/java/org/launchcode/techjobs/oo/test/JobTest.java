package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import static org.junit.Assert.*;



/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job aJob = new Job();

        Job anotherJob = new Job();

        assertNotEquals(aJob.getId(), anotherJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(aJob.getEmployer() instanceof Employer);
        assertTrue(aJob.getLocation() instanceof Location);
        assertTrue(aJob.getPositionType() instanceof PositionType);
        assertTrue(aJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(aJob instanceof Job);
        assertEquals(aJob.getName(), "Product tester");
        assertEquals(aJob.getEmployer().toString(), "ACME");
        assertEquals(aJob.getLocation().toString(), "Desert");
        assertEquals(aJob.getPositionType().toString(), "Quality control");
        assertEquals(aJob.getCoreCompetency().toString(),"Persistence");
    }
    @Test
    public void testJobsForEquality(){
        Job aJob = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("Position"), new CoreCompetency("Competency"));

        Job anotherJob = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("Position"), new CoreCompetency("Competency"));
        assertFalse(aJob.equals(anotherJob));
    }
}
