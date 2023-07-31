package com.assignment;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//As a User need to enter a valid Last Name
// Last name starts with Cap and has minimum 3 characters
public class UpperLastName {
    public void checkUpper(){
        String lastName="More";
        Pattern p= Pattern.compile("[A-Z][a-z]{2,}");
        Matcher m= p.matcher(lastName);
        boolean ifPresent=m.find();
        System.out.println(ifPresent);
    }

    public static void main(String[] args) {
        UpperLastName lastNameUpperObj = new UpperLastName();
        lastNameUpperObj.checkUpper();
    }
}