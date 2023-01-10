package org.example;

import static org.example.Wordlist.generateWord;
import static org.example.Wordlist.word;

public class Game {

    Wordlist wordlist = new Wordlist();
    Commands commands = new Commands();

    protected int lives = 8;

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decrementLives(){
        lives--;
    }

    public void playGame(){
        System.out.println("Welcome to hangman game");
        getLives();
        System.out.println("You have " + getLives() + " chances");

        StringBuilder result = new StringBuilder(wordlist.replaceLetters());
        while (result.toString().contains("_")) {
            if (getLives() > 0) {
                System.out.println("Type in character");
                char guess = commands.getCharacter();

                if (Wordlist.word.contains(Character.toString(guess))) {
                    for (int i = 0; i < Wordlist.word.length(); i++) {
                        if (Wordlist.word.charAt(i) == guess) {
                            result.setCharAt(i, guess);
                        }
                    }
                    System.out.println(result);


                } else {
                    System.out.println("There is no letter '" + guess + "' in this word.");
                    decrementLives();
                    System.out.println("Chances left: " + getLives());
                    System.out.println(result);



                    if (getLives() < 1) {
                        System.out.println("Game Over. The word was '" + word +"'");
                        break;
                    }
                }
            }
        }

        if (!result.toString().contains("_") && getLives() > 0) {
            System.out.println("Congratulations, you've won with " + getLives() + " lives left!");
        }
    }

    public void replayGame(){
            System.out.println("Would you like to play again? Y/N");
            char replayAnswer = commands.getReplayAnswer();
            if (replayAnswer == 'y'){
                setLives(5);
                generateWord();
                playGame();
            } else if (replayAnswer == 'n') {
                System.out.println("Thanks for playing!");
            } else {
                System.out.println("Please enter a valid letter");
        }
    }



}

