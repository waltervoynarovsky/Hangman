package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Commands {
    private static Scanner scanner = new Scanner(System.in);

    public char getCharacter(){
        return scanner.nextLine().charAt(0);
    };

}
