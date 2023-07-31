package com.assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

    public void passwordRules(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");

        String password = sc.nextLine();
    String regex = "^(?=.*?[0-9a-zA-Z])[0-9a-zA-Z]*[!@#$%^&*()_-][0-9a-zA-Z]*$";
    //^(?=.*?[0-9a-zA-Z]) - ensures there is at least one lower case, upper case or digit
    //[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]* - ensures that there exactly one match for the special character
    // The ^ and $ anchors ensure that whatever we are matching is the whole string, avoiding partial matches with forbidden characters later.
        Pattern p =  Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if (m.find()){
            System.out.println( password +" is valid");
        }else {
            System.out.println( password + " is not valid");
        }
    }

    public static void main(String[] args) {
        ValidPassword passObj = new ValidPassword();
        passObj.passwordRules();
    }
}