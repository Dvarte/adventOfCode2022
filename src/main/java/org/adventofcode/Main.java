package org.adventofcode;

import org.adventofcode.day1.CalorieCounting;
import org.adventofcode.day2.RockPaperScissors;
import org.adventofcode.day3.RucksackReorganization;

public class Main {
    public static void main(String[] args) {

        // CalorieCounting calorieCounting = new CalorieCounting();
        // calorieCounting.maxNumberCalories("src/main/resources/InputCalories.txt");

        // RockPaperScissors rockPaperScissors = new RockPaperScissors();
        // rockPaperScissors.tournament("src/main/resources/StrategyInput.txt");
        // rockPaperScissors.tournamentExplained("src/main/resources/StrategyInput.txt");

        RucksackReorganization rucksackReorganization = new RucksackReorganization();
        // rucksackReorganization.findDuplicateItem("src/main/resources/ItemsInput.txt");
        rucksackReorganization.findBadges("src/main/resources/ItemsInput.txt");

    }
}