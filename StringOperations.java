// Find Duplicates and Vowel Words in a String

import java.util.regex.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StringOperations {
    public static void main(String[] args) {
        String inputString = "This is a sample string with duplicate words. This is a test string with vowels like apple, orange, and lemon.";

        // Find duplicate words
        String[] words = inputString.split("\\s+");  // Split the string into words
        HashSet<String> uniqueWords = new HashSet<>();
        ArrayList<String> duplicateWords = new ArrayList<>();

        for (String word : words) {
            if (!uniqueWords.add(word)) {
                duplicateWords.add(word);
            }
        }

        System.out.println("Duplicate words: " + duplicateWords);

        // Find and print words consisting of vowels in alphabetical order
        ArrayList<String> vowelWords = new ArrayList<>();

        for (String word : words) {
            if (word.matches("^[AEIOUaeiou]+$")) {
                vowelWords.add(word);
            }
        }

        Collections.sort(vowelWords);  // Sort the vowel words alphabetically
        System.out.println("Words with vowels in alphabetical order: " + vowelWords);
    }
}

