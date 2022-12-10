package org.adventofcode;

import org.adventofcode.day1.CalorieCounting;
import org.adventofcode.day2.RockPaperScissors;

public class Main {
    public static void main(String[] args) {

        // CalorieCounting calorieCounting = new CalorieCounting();
        // calorieCounting.maxNumberCalories("src/main/resources/InputCalories.txt");

        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        // rockPaperScissors.tournament("src/main/resources/StrategyInput.txt");
        rockPaperScissors.tournamentExplained("src/main/resources/StrategyInput.txt");

    }
}