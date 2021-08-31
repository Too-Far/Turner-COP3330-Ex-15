/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class App
{
    public static void getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pwAttempt;
        String password = "abc123";

        while (true)
        {
            System.out.println("What is the password? ");
            pwAttempt = reader.readLine();
            if (Objects.equals(pwAttempt, password))
            {
                System.out.println("Welcome!");
                break;
            } else
            {
                System.out.println("I don't know you.");
            }
        }
    }

    public static void main( String[] args ) throws IOException {
        getInput();
    }
}
