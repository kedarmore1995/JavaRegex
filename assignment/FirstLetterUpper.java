package com.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//As a User need to enter a valid First Name
//- First name starts with Cap and has minimum 3 characters
public class FirstLetterUpper {
    public void checkUpper(){
        String name="Kedar";
        Pattern p= Pattern.compile("[A-Z][a-z]{2,}");
        Matcher m= p.matcher(name);
        boolean ifPresent=m.find();
        System.out.println(ifPresent);
    }

    public static void main(String[] args) {
        FirstLetterUpper upperObj = new FirstLetterUpper();
        upperObj.checkUpper();

    }
}
