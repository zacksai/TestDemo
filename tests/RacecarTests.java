import org.testng.annotations.Test;
import org.junit.Assert;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RacecarTests {

    @Test
    public void dummy() {
        Racecar sample = new Racecar();

        int sampleMiles = 30;
        int sampleGallons = 1;

        assertFalse("Condition not met! Try again", 29 == sample.calculateMPG(sampleMiles, sampleGallons));

    }

    @Test
    public void dummy1() {
        Racecar sample = new Racecar();

        int sampleMiles = 30;
        int sampleGallons = 1;

        assertTrue("Condition not met! Try again", 30 == sample.calculateMPG(sampleMiles, sampleGallons));

    }


}