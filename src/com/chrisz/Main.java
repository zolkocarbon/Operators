package com.chrisz;

public class Main {

    public static void main(String[] args) {
        // Operators
        // equals and plus
        int result = 1 + 2;

        int previousResult = result;
        result = result - 1;

        result--;
        result++;

        result += 2;
        result -= 2;
        result *= 10;
        result /= 10;

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore != 100)
            System.out.println("You go the highest score");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than top score and less than 100");

      // IntelliJ -> Code -> Reformat Code, cleans up format


    }
}
