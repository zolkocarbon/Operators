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
        if ((topScore > secondTopScore) && (topScore < 100)) //instructor recommends brackets around conditions
            System.out.println("Greater than top score and less than 100");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        // if statement is looking for boolean (T/F), and second test below reassigns isCar and returns true
        // due to one equals sign
        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar = true)
            System.out.println("Reassigned value in test");

        isCar = true;
        boolean wasCar = isCar ? true : false; // ternary operator
        if(wasCar)
            System.out.println("wasCar is true");

        //challenge
        double firstDouble = 20;
        double secondDouble = 80;
        double resultDouble = ((firstDouble + secondDouble)*25)%40;
        if (resultDouble <= 20)
            System.out.println("Total was over the limit " + resultDouble);

        // Operator order resource http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        // IntelliJ -> Code -> Reformat Code, cleans up format


    }
}
