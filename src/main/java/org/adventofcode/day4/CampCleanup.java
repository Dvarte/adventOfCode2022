package org.adventofcode.day4;

import org.adventofcode.Utils;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CampCleanup {

    private String getInputItems(String inputPath) {
        return Utils.readFile(inputPath);
    }

    private boolean fullyOverlaped(List<Integer> firstElf, List<Integer> secondElf) {
        return new HashSet<>(firstElf).containsAll(secondElf) || new HashSet<>(secondElf).containsAll(firstElf);
    }

    private boolean partiallyOverlaped(List<Integer> firstElf, List<Integer> secondElf) {
        secondElf.retainAll(firstElf);
        return !secondElf.isEmpty();
    }

    public void cleaningPairs(String inputPath) {
        String inputPairs = getInputItems(inputPath);
        String[] inputPairsList = inputPairs.split("\\r\\n");
        String[] pairs = null;
        List<Integer> firstElf = null;
        List<Integer> secondElf = null;
        int assignmentsFullyOverlaped = 0;
        int assignmentsPartiallyOverlaped = 0;

        for(String inputPair : inputPairsList) {
            pairs = inputPair.split(",");
            firstElf = IntStream.rangeClosed(Integer.parseInt(pairs[0].split("-")[0]), Integer.parseInt(pairs[0].split("-")[1])).boxed()
                    .collect(Collectors.toList());
            secondElf = IntStream.rangeClosed(Integer.parseInt(pairs[1].split("-")[0]), Integer.parseInt(pairs[1].split("-")[1])).boxed()
                    .collect(Collectors.toList());
            if (fullyOverlaped(firstElf, secondElf)) {
                assignmentsFullyOverlaped += 1;
            }
            if (partiallyOverlaped(firstElf, secondElf)) {
                assignmentsPartiallyOverlaped += 1;
            }
        }

        System.out.println("Number of assignments pairs fully overlaped > " + assignmentsFullyOverlaped);
        System.out.println("Number of assignments pairs partially overlaped > " + assignmentsPartiallyOverlaped);

    }
}
