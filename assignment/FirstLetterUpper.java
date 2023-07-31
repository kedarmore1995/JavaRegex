package com.assignment;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//As a User need to enter a valid First Name
//- First name starts with Cap and has minimum 3 characters
public class FirstLetterUpper {
    public void checkUpper(){
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
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
