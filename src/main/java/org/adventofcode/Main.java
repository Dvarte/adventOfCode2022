package org.adventofcode;

import org.adventofcode.day1.CalorieCounting;

public class Main {
    public static void main(String[] args) {

        CalorieCounting calorieCounting = new CalorieCounting();
        calorieCounting.maxNumberCalories("src/main/resources/InputCalories.txt");

    }
}