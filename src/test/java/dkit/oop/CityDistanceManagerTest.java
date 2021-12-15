package dkit.oop;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CityDistanceManagerTest {

    private CityDistanceManager cdm;

    @BeforeEach
    public void setup()
    {
        cdm = new CityDistanceManager();
    }

    @org.junit.jupiter.api.Test
    void testFindDistanceBetween_DublinAndBelfast()
    {
        String city1 = "Dublin";
        String city2 = "Belfast";

        int expectedDistance = 167;
        int actualDistance = cdm.findDistanceBetween(city1,city2);

        assertEquals(expectedDistance,actualDistance);
    }

    @org.junit.jupiter.api.Test
    void testFindDistanceBetween_LimerickAndGalway()
    {
        String city1 = "Limerick";
        String city2 = "Galway";

        int expectedDistance = 105;
        int actualDistance = cdm.findDistanceBetween(city1,city2);

        assertEquals(expectedDistance,actualDistance);
    }

}