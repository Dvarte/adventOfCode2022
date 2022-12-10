package org.adventofcode.day2;

import org.adventofcode.Utils;

public class RockPaperScissors {

    private String getInputStrategy(String inputPath) {
        return Utils.readFile(inputPath);
    }

    public void tournament(String inputPath) {
        String strategy = getInputStrategy(inputPath);
        String[] strategyLines = strategy.split("\\r\\n");
        int total = 0;
        int round = 0;
        int shape = 0;
        for (String line : strategyLines) {
            switch(line.charAt(0)) {
                case 'A':
                    if (line.charAt(2) == 'X') {
                        round = 3;
                        shape = 1;
                    } else if (line.charAt(2) == 'Y') {
                        round = 6;
                        shape = 2;
                    } else if (line.charAt(2) == 'Z') {
                        round = 0;
                        shape = 3;
                    }
                    total += round + shape;
                    break;
                case 'B':
                    if (line.charAt(2) == 'X') {
                        round = 0;
                        shape = 1;
                    } else if (line.charAt(2) == 'Y') {
                        round = 3;
                        shape = 2;
                    } else if (line.charAt(2) == 'Z') {
                        round = 6;
                        shape = 3;
                    }
                    total += round + shape;
                    break;
                case 'C':
                    if (line.charAt(2) == 'X') {
                        round = 6;
                        shape = 1;
                    } else if (line.charAt(2) == 'Y') {
                        round = 0;
                        shape = 2;
                    } else if (line.charAt(2) == 'Z') {
                        round = 3;
                        shape = 3;
                    }
                    total += round + shape;
                    break;
            }
        }
        System.out.println("Total score > " + total);
    }

    public void tournamentExplained(String inputPath) {
        String strategy = getInputStrategy(inputPath);
        String[] strategyLines = strategy.split("\\r\\n");
        int total = 0;
        int round = 0;
        int shape = 0;
        for (String line : strategyLines) {
            switch(line.charAt(0)) {
                case 'A':
                    if (line.charAt(2) == 'X') {
                        round = 0;
                        shape = 3;
                    } else if (line.charAt(2) == 'Y') {
                        round = 3;
                        shape = 1;
                    } else if (line.charAt(2) == 'Z') {
                        round = 6;
                        shape = 2;
                    }
                    total += round + shape;
                    break;
                case 'B':
                    if (line.charAt(2) == 'X') {
                        round = 0;
                        shape = 1;
                    } else if (line.charAt(2) == 'Y') {
                        round = 3;
                        shape = 2;
                    } else if (line.charAt(2) == 'Z') {
                        round = 6;
                        shape = 3;
                    }
                    total += round + shape;
                    break;
                case 'C':
                    if (line.charAt(2) == 'X') {
                        round = 0;
                        shape = 2;
                    } else if (line.charAt(2) == 'Y') {
                        round = 3;
                        shape = 3;
                    } else if (line.charAt(2) == 'Z') {
                        round = 6;
                        shape = 1;
                    }
                    total += round + shape;
                    break;
            }
        }
        System.out.println("Total score with strategy explained > " + total);
    }
}
