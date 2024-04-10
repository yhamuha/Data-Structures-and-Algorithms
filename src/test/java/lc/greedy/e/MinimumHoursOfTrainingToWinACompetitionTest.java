package lc.greedy.e;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumHoursOfTrainingToWinACompetitionTest {
    @Test
    public void testMinNumberOfHours() {
        MinimumHoursOfTrainingToWinACompetition competition = new MinimumHoursOfTrainingToWinACompetition();
        int initialEnergy = 5;
        int initialExperience = 3;
        int[] energy = {1, 4, 3, 2};
        int[] experience = {2, 6, 3, 1};

        assertEquals(8, competition.minNumberOfHours(initialEnergy, initialExperience, energy, experience));
    }

}