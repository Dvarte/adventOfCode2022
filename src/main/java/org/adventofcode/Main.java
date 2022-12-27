package org.adventofcode;

import org.adventofcode.day1.CalorieCounting;
import org.adventofcode.day2.RockPaperScissors;
import org.adventofcode.day3.RucksackReorganization;
import org.adventofcode.day4.CampCleanup;
import org.adventofcode.day5.SupplyStacks;

public class Main {
    public static void main(String[] args) {

        // Day 1
        // CalorieCounting calorieCounting = new CalorieCounting();
        // calorieCounting.maxNumberCalories("src/main/resources/InputCalories.txt");

        // Day 2
        // RockPaperScissors rockPaperScissors = new RockPaperScissors();
        // rockPaperScissors.tournament("src/main/resources/StrategyInput.txt");
        // rockPaperScissors.tournamentExplained("src/main/resources/StrategyInput.txt");

        // Day 3
        // RucksackReorganization rucksackReorganization = new RucksackReorganization();
        // rucksackReorganization.findDuplicateItem("src/main/resources/ItemsInput.txt");
        // rucksackReorganization.findBadges("src/main/resources/ItemsInput.txt");

        // Day 4
        // CampCleanup campCleanup = new CampCleanup();
        // campCleanup.cleaningPairs("src/main/resources/SectionAssignmentsInput.txt");

        // Day 5
        SupplyStacks supplyStacks = new SupplyStacks();
        // supplyStacks.rearrangement9000("src/main/resources/RearrangementInstructionsInput.txt");
        supplyStacks.rearrangement9001("src/main/resources/RearrangementInstructionsInput.txt");
    }
}