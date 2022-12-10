package org.adventofcode.day3;

import org.adventofcode.Utils;

import java.util.*;

public class RucksackReorganization {

    private String getInputItems(String inputPath) {
        return Utils.readFile(inputPath);
    }

    private Collection<Character> getCommonChar(List<String> listStrings) {
        if (listStrings == null || listStrings.isEmpty()) {
            return Collections.emptyList();
        }

        Set<Character> commonChars = convertStringToSetOfChars(listStrings.get(0));
        listStrings.stream().skip(1).forEach(s -> commonChars.retainAll(convertStringToSetOfChars(s)));

        return commonChars;
    }

    private static Set<Character> convertStringToSetOfChars(String string) {
        if (string == null || string.isEmpty()) {
            return Collections.emptySet();
        }

        Set<Character> set = new HashSet<>(string.length() + 10);
        for (char c : string.toCharArray()) {
            set.add(c);
        }

        return set;
    }

    public void findDuplicateItem(String inputPath) {
        String inputItems = getInputItems(inputPath);
        String[] inputItemsLines = inputItems.split("\\r\\n");
        String firstCompartment = "";
        String secondCompartment = "";
        List<Character> s1 = new ArrayList<>();
        List<Character> s2 = new ArrayList<>();
        List<Character> duplicateItems = new ArrayList<>();
        int sumPriorities = 0;
        int itemPriority = 0;

        for (String item : inputItemsLines) {
            firstCompartment = item.substring(0, item.length() / 2);
            secondCompartment = item.substring(item.length() / 2);
            for (int i = 0; i < firstCompartment.length(); i++) {
                s1.add(firstCompartment.charAt(i));
            }
            for (int i = 0; i < secondCompartment.length(); i++) {
                s2.add(secondCompartment.charAt(i));
            }
            s1.retainAll(s2);
            duplicateItems.add(s1.get(0));
            s1.clear();
            s2.clear();
        }

        for (char c : duplicateItems) {
            itemPriority = Character.isLowerCase(c) ? c - 96 : c - 38;
            sumPriorities += itemPriority;
        }
        System.out.println("Sum of the priorities of item types is > " + sumPriorities);
    }

    public void findBadges(String inputPath) {
        String inputItems = getInputItems(inputPath);
        String[] inputItemsLines = inputItems.split("\\r\\n");
        List<String> groupeElves = new ArrayList<>();
        List<Collection<Character>> badges = new ArrayList<>();
        int badgeValue = 0;
        int sumBadges = 0;

        for (int i = 0; i < inputItemsLines.length; i += 3) {
            groupeElves.add(inputItemsLines[i]);
            groupeElves.add(inputItemsLines[i+1]);
            groupeElves.add(inputItemsLines[i+2]);
            badges.add(getCommonChar(groupeElves));
            groupeElves.clear();
        }

        for (Collection<Character> badge : badges) {
            char firstItem = badge.stream().findFirst().get();
            badgeValue = Character.isLowerCase(firstItem) ? firstItem - 96 : firstItem - 38;
            sumBadges += badgeValue;
        }
        System.out.println("Sum of priorities > " + sumBadges);
    }

}
