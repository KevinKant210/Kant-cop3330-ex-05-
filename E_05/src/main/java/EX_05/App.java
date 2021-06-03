package EX_05;



import java.util.Scanner;
/**
 You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

 Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

 Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.

 Keep the inputs and outputs separate from the numerical conversions and other processing.

 Generate a single output statement with line breaks in the appropriate spots.

 UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant

 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        System.out.print( "What is the first number: " );
        int numFirst = Integer.parseInt(reader.nextLine());
        System.out.print("What is the second number: ");
        int numSecond = Integer.parseInt((reader.nextLine()));

        BuildMath mathBot = new BuildMath(numFirst,numSecond);

        mathBot.CreateOutput();
    }
}
