package com.assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmailValidation {
    public void checkValidEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");

        String input = sc.nextLine();

        String regex = "^([a-z0-9+_-]+)(\\.)?[a-z0-9_-]+(@)([a-z0-9_-]+)((\\.)([a-z]{2,}))?(\\.)([a-z]{2,})$";

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
        SampleEmailValidation emailObj = new SampleEmailValidation();
        emailObj.checkValidEmail();
    }
}
