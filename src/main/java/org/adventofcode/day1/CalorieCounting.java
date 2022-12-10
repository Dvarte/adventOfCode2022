package org.adventofcode.day1;

import org.adventofcode.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CalorieCounting {

    private String getInputCalories(String inputPath) {
        return Utils.readFile(inputPath);
    }

    private Integer getMaxCalories(List<Integer> caloriesByElf) {
        return caloriesByElf.stream().mapToInt(value -> value).max().orElseThrow(NoSuchElementException::new);
    }

    private Integer getSumTopThreeMaxCalories(List<Integer> caloriesByElf) {
        return caloriesByElf.stream().sorted(Comparator.reverseOrder()).limit(3).reduce(0, Integer::sum);
    }

    public void maxNumberCalories(String inputPath) {
        String listOfCalories = getInputCalories(inputPath);
        String[] lines = listOfCalories.split("\\r\\n");
        int calories = 0;
        List<Integer> caloriesByElf = new ArrayList<>();
        for (String line : lines) {
            if (!line.equals("")) {
                calories += Integer.parseInt(line);
            } else {
                caloriesByElf.add(calories);
                calories = 0;
            }
        }
        System.out.println("Max number of calories carried by one elf > " + getMaxCalories(caloriesByElf));
        System.out.println("Total of calories carried by top 3 elves > " + getSumTopThreeMaxCalories(caloriesByElf));
    }
}
