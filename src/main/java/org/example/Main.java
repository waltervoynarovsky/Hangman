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


        while (result.toString().contains("_")) {
            if (lives > 0) {
                System.out.println("Your move");
                char guess = commands.getCharacter();
                System.out.println(guess);
                if (word.contains(Character.toString(guess))) {
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == guess) {
                            result.setCharAt(i, guess);
                        }
                        else {
                            lives--;
                        }
                    }
                            System.out.println(result);
                } else {
                    lives--;
                    System.out.println("Game Over");
                    break;
                }
            }
        }
    }}

//                            int number = word.charAt(i);
//                            result = result.substring(0, number) + guess + result.substring(number + 1); // D _ _ | D _ Ga
//                         result = result.replace(character, guess);
//                        }
//                            System.out.println(result);
//                            System.out.println(word.indexOf(guess));

//                         UPDATING THE RESULT STRING AT THE INDEX OF THE GUESS
