package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        System.out.println("Please enter a string to count characters: ");
        String userInput = input.nextLine();

        char[] charactersInString = userInput.toLowerCase().replaceAll("[^a-z]", "").toCharArray();

        for (char character : charactersInString)
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) +1);
            }
            else {
                characterCounts.put(character, 1);
            }

        for(Map.Entry<Character, Integer> oneChar : characterCounts.entrySet())
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
    }
}
