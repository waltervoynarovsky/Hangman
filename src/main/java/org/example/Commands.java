package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Commands {
    private static Scanner scanner = new Scanner(System.in);

    public char getCharacter() {
        //set car to empty
      String guess = "";
      boolean loop = true;

      while(loop){
          guess = scanner.nextLine();

          if(guess.isEmpty()){
              System.out.println("please enter a valid letter");
          } else {
              loop=false;
          }
      }

      return guess.charAt(0);

    }

    public char getReplayAnswer(){
        String answer = "";
        boolean loop = true;

        while(loop){
            answer = scanner.nextLine();

            if(answer.isEmpty()){
                System.out.println("Please enter a valid letter");
            } else {
                loop=false;
            }
        }

        return answer.toLowerCase().charAt(0);
    }
}
