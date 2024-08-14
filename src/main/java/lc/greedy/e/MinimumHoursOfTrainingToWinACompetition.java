package lc.greedy.e;

public class MinimumHoursOfTrainingToWinACompetition {
    //O(n) O(1)
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int traning=0,n=energy.length;
        for(int i=0; i<n; i++) {
            if(energy[i]>=initialEnergy) {
                int diff=energy[i]-initialEnergy;
                traning+=diff+1;
                initialEnergy+=diff+1;
            }
            if(experience[i]>=initialExperience) {
                int diff=experience[i]-initialExperience;
                traning+=diff+1;
                initialExperience+=diff+1;
            }
            initialEnergy-=energy[i];
            initialExperience+=experience[i];
        }
        return traning;
    }
    public static void main(String[] args) {
        MinimumHoursOfTrainingToWinACompetition competition = new MinimumHoursOfTrainingToWinACompetition();
        int initialEnergy = 5;
        int initialExperience = 3;
        int[] energy = {1, 4, 3, 2};
        int[] experience = {2, 6, 3, 1};
        int hours = competition.minNumberOfHours(initialEnergy, initialExperience, energy, experience);
        System.out.println(hours);
    }
}
