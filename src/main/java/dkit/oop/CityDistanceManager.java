package dkit.oop;

public class CityDistanceManager {

    String cities[] = {"Dublin", "Belfast", "Cork", "Limerick", "Galway"};

    int[][] distances =
            {           // distances between the cities Dublin to Belfast is 167km
                    {0, 167, 257, 198, 219},
                    {167, 0, 424, 323, 306},
                    {257, 424, 0, 105, 209},
                    {198, 323, 105, 0, 105},
                    {219, 306, 209, 105, 0}
            };

    CityDistanceManager(){};    // constructor;

    // Q4.1
    public int findDistanceBetween(String city1, String city2) {
        int city1Index = -1, city2Index = -1;

        for(int i = 0; i < cities.length; i++)
        {
            if(cities[i].equalsIgnoreCase(city1))
            {
                city1Index = i;
            }
            else if(cities[i].equalsIgnoreCase(city2))
            {
                city2Index = i;
            }
        }

        return distances[city1Index][city2Index];

    }

    // Q4.2
    public String findClosestCityTo(String searchCity) {
        int cityIndex = -1;

        for(int i = 0; i < cities.length; i++)
        {
            if(cities[i].equalsIgnoreCase(searchCity))
            {
                cityIndex = i;
            }
        }

        int[] searchArray = distances[cityIndex];
        int closestCityIndex = -1;
        int min = Integer.MAX_VALUE;

        for(int j = 0; j < searchArray.length; j++)
        {
            if(searchArray[j] < min && searchArray[j] != 0)
            {
                min = searchArray[j];
                closestCityIndex = j;
            }
        }

        return cities[closestCityIndex];
    }

    /////////////// no changes required below this comment ///////////////

    public  void printCitiesData() {
        System.out.printf("%-10s", "");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%10s", cities[i]);
        }
        System.out.println("");

        for (int i = 0; i < distances.length; i++) {
            System.out.printf("%-10s", cities[i]);

            for (int j = 0; j < distances.length; j++) {
                System.out.printf("%10d", distances[i][j]);
            }
            System.out.println("");
        }
    }
}
