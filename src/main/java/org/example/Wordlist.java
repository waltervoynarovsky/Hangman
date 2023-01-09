package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Wordlist {

    private static ArrayList<String> words = new ArrayList<>();
    private static final Random random = new Random();

    static {
        words.add("Abbie");
        words.add("Alfred");
        words.add("Beth");
        words.add("Bob");
        words.add("Bonzo");
        words.add("Butch");
        words.add("Charlotte");
        words.add("Clyde");
        words.add("Ermintrude");
        words.add("Eve");
        words.add("Florence");
        words.add("Fluffy");
        words.add("Freddie");
        words.add("Grumpy");
        words.add("Holly");
        words.add("Kate");
        words.add("Knuckles");
        words.add("Lauren");
        words.add("Leo");
        words.add("Maisie");
        words.add("Max");
        words.add("Nigel");
        words.add("Rex");
        words.add("Roger");
        words.add("Scoobie");
        words.add("Spangle");
        words.add("Star");
        words.add("Sydney");
        words.add("Tiddles");
    }


    public static String generateWord() {

        String challenge = words.get(random.nextInt(words.size()));
        return challenge.toLowerCase();
    }
}