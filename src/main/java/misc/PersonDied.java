package misc;

public class PersonDied {

    class Person {
        public int birthYear;
        public int deathYear;
    }

    int[] getPopulationDeltas(Person[] persons,
                              int startYear,
                              int endYear) {
        int yearCount = endYear - startYear + 2;
        int[] aliveDeltas = new int[yearCount];

        for(Person person : persons) {
            int birth = person.birthYear - startYear;
            int death = person.deathYear - startYear;

            aliveDeltas[birth] += 1;
            aliveDeltas[death + 1] -= 1;
        }
        return aliveDeltas;
    }

    int getMaxAliveYear (int[] aliveDeltas) {
        int maxAlive = 0;
        int maxAliveYear = 0;
        int currentAlive = 0;

        for (int year = 0; year < aliveDeltas.length; year++) {
            currentAlive += aliveDeltas[year];

            if (currentAlive > maxAlive) {
                maxAliveYear = year;
                maxAlive = currentAlive;
            }
        }
        return maxAliveYear;
    }


    // time complexity O(N+K)
    // where:   N - quantity of years during
    //          K - quantity of people
    int maxAliveYear (Person[] persons,
                      int startYear,
                      int endYear) {

        // got aliveDeltas
        int[] aliveDeltas = getPopulationDeltas(persons, startYear, endYear);
        // found the year with a shift
        int maxAliveYear = getMaxAliveYear(aliveDeltas);
        // get a real year
        return startYear + maxAliveYear;
    }
}
