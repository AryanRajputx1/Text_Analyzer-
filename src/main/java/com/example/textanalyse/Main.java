package com.example.textanalyse;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter the text");

        WordCount a = new WordCount();
        StringBuilder input = new StringBuilder();
        Characte ax = new Characte();


        String line;
        while (true) {
            line = in.nextLine();
            if (line.equals(".")) {
                break;
            }
            input.append(line).append("\n");
        }
        System.out.println("You entered:");
        System.out.println(input.toString());
        int wordCount = a.Count(input.toString());
        System.out.println("Word Count: " + wordCount);
        int charactercount = ax.charaCount(input.toString());
        System.out.println("Character  Count: " + charactercount);

    }
}


