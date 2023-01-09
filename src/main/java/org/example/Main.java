package org.example;

import java.util.ArrayList;

import static org.example.Wordlist.generateWord;

public class Main {

    public static void main(String[] args) {
        Commands commands = new Commands();
        // list of characters the users input
        ArrayList<String> letters = new ArrayList<>();

        System.out.println("Welcome to hangman game");

        // LIMITATIONS
        // - INDEXOF WILL ONLY CHECK ONE LETTER
        // - INDEX -> LOOP -> INDEX

        String word = generateWord();

        String replaced = word.replaceAll(".", "_");
        System.out.println(replaced);
        System.out.println(word);
        int lives = 5;
        StringBuilder result = new StringBuilder(replaced);


        System.out.println(lives);
        while (result.toString().contains("_")) {
            if (lives > 0) {
                System.out.println("Type in character");
                char guess = commands.getCharacter();
                if (Character.toString((guess)).isEmpty()) {
                    System.out.println("Type in character");
                } else {
                    if (word.contains(Character.toString(guess))) {
                        for (int i = 0; i < word.length(); i++) {
                            if (word.charAt(i) == guess) {
                                result.setCharAt(i, guess);
                            }
                        }
                        System.out.println(result);

                    } else {
                        System.out.println("There is no letter '" + guess + "' in this word.");
                        lives--;
                        System.out.println("Chances left: " + lives);
                        System.out.println(result);
                        if (lives < 1) {
                            System.out.println("Game Over");
                            break;
                        }
                    }
                }
            }
        }
        if (!result.toString().contains("_") && lives > 0) {
            System.out.println("Congratulations, you've won with " + lives + " lives left!");
        }
    }
}
