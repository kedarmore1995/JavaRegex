package com.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//abc.xyz@bl.co.in
public class ValidEmail {
    public void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input : ");
        String input = sc.nextLine();
        //Regular expression
        String regex = "(abc.)+(xyz)?(@bl)+(.co.)+(in)?";
        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            System.out.println(input+" is valid");
        }else {
            System.out.println(input+" is not valid");

        }
    }

    public static void main(String[] args) {
        ValidEmail validEmail= new ValidEmail();
        validEmail.checkEmail();
    }
}
