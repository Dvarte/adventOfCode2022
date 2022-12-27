package org.adventofcode.day5;

import org.adventofcode.Utils;

public class SupplyStacks {

    private String getInputItems(String inputPath) {
        return Utils.readFileFromLine(inputPath, 10);
    }

    private char[][] initialStacks() {

        char[][] stacks = new char[72][9];
        stacks[0] = new char[]{'N', 'C', 'Q', 'H', 'N', 'D', 'Q', 'M', 'B'};
        stacks[1] = new char[]{'D', 'L', 'H', 'G', 'F', 'Q', 'M', 'G', 'W'};
        stacks[2] = new char[]{'M', 'Z', 'R', 'D', 'Q', 'V', 'T', 'F', 'R'};
        stacks[3] = new char[]{'Q', 'Q', 'D', 'F', ' ', 'Z', 'Z', 'P', 'M'};
        stacks[4] = new char[]{'B', 'M', 'V', 'N', ' ', 'F', 'D', 'N', ' '};
        stacks[5] = new char[]{'P', 'D', 'F', ' ', ' ', 'B', 'V', 'Q', ' '};
        stacks[6] = new char[]{'Z', 'H', 'Z', ' ', ' ', 'T', 'S', ' ', ' '};
        stacks[7] = new char[]{' ', 'V', 'G', ' ', ' ', ' ', 'H', ' ', ' '};

        for (int i = 8; i < stacks.length; i++) {
            stacks[i] = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        }

        return stacks;

        /**return new char[][]{
                {'N', 'C', 'Q', 'H', 'N', 'D', 'Q', 'M', 'B'},
                {'D', 'L', 'H', 'G', 'F', 'Q', 'M', 'G', 'W'},
                {'M', 'Z', 'R', 'D', 'Q', 'V', 'T', 'F', 'R'},
                {'Q', 'Q', 'D', 'F', ' ', 'Z', 'Z', 'P', 'M'},
                {'B', 'M', 'V', 'N', ' ', 'F', 'D', 'N', ' '},
                {'P', 'D', 'F', ' ', ' ', 'B', 'V', 'Q', ' '},
                {'Z', 'H', 'Z', ' ', ' ', 'T', 'S', ' ', ' '},
                {' ', 'V', 'G', ' ', ' ', ' ', 'H', ' ', ' '}
        };**/
    }

    private void printStacks(char[][] stacks) {
        for (int i = stacks.length - 1; i >= 0; i--) {
            for (int j = 0; j <= 8; j++) {
                System.out.print(" [" + stacks[i][j] + "] ");
            }
            System.out.print("\n");
        }
    }

    public void rearrangement9000(String inputPath) {
        String rearrangementInstructions = getInputItems(inputPath);
        String[] rearrangementInstructionsList = rearrangementInstructions.split("\\n");
        char[][] stacks = initialStacks();
        int numberOfCrates = 0;
        int initialColumn = 0;
        int finalColumn = 0;
        int rowsNumber = stacks.length;
        String[] aux = null;

        System.out.println("Initial stack of crates");
        printStacks(stacks);

        for (String instruction : rearrangementInstructionsList) {
            aux = instruction.split(" ");
            numberOfCrates = Integer.parseInt(aux[1]);
            initialColumn = Integer.parseInt(aux[3]);
            finalColumn = Integer.parseInt(aux[5]);
            for (int i = 0; i < numberOfCrates; i++) {
                int j = rowsNumber - 1;
                int k = rowsNumber - 1;
                while (stacks[j][initialColumn - 1] == ' ') {
                    j--;
                    if (j == 0) {
                        break;
                    }
                }
                while (stacks[k][finalColumn - 1] == ' ') {
                    k--;
                    if (k == 0) {
                        break;
                    }
                }
                stacks[k + 1][finalColumn - 1] = stacks[j][initialColumn - 1];
                stacks[j][initialColumn - 1] = ' ';

            }
        }

        System.out.println("Final stack of crates");
        printStacks(stacks);
    }

    public void rearrangement9001(String inputPath) {
        String rearrangementInstructions = getInputItems(inputPath);
        String[] rearrangementInstructionsList = rearrangementInstructions.split("\\n");
        char[][] stacks = initialStacks();
        int numberOfCrates = 0;
        int initialColumn = 0;
        int finalColumn = 0;
        int rowsNumber = stacks.length;
        String[] aux = null;
        char[] cratesToMove = null;

        System.out.println("Initial stack of crates");
        printStacks(stacks);

        for (String instruction : rearrangementInstructionsList) {
            aux = instruction.split(" ");
            numberOfCrates = Integer.parseInt(aux[1]);
            initialColumn = Integer.parseInt(aux[3]);
            finalColumn = Integer.parseInt(aux[5]);
            int j = rowsNumber - 1;
            int k = rowsNumber - 1;
            while (stacks[j][initialColumn - 1] == ' ') {
                j--;
                if (j == 0) {
                    break;
                }
            }
            while (stacks[k][finalColumn - 1] == ' ') {
                k--;
                if (k == 0) {
                    break;
                }
            }
            for (int i = 0; i < numberOfCrates; i++) {

            }
        }
    }
}
