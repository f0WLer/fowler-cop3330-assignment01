import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("What is the input string? ");
        input = scanner.nextLine();
        System.out.println(input + " has " + input.length() + " characters.");
    }
}