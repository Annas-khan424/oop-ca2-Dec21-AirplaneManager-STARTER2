package dkit.oop;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CityDistanceManagerTest {

    private CityDistanceManager CityDistanceManager;

    @BeforeEach
    public void setup()
    {
        CityDistanceManager = new CityDistanceManager();
    }

    @org.junit.jupiter.api.Test
    void testFindDistanceBetween_DublinAndcork()
    {
        String city1 = "Dublin";
        String city2 = "cork";

        int expectedDistance = 257;
        int actualDistance = CityDistanceManager.findDistanceBetween(city1,city2);

        assertEquals(expectedDistance,actualDistance);
    }

    @org.junit.jupiter.api.Test
    void testFindDistanceBetween_LimerickAndGalway()
    {
        String city1 = "Limerick";
        String city2 = "Galway";

        int expectedDistance = 105;
        int actualDistance = CityDistanceManager.findDistanceBetween(city1,city2);

        assertEquals(expectedDistance,actualDistance);
    }

}