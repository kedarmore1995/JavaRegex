package com.assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNum {
    public void checkMobileNo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");

        String mobileNum=sc.nextLine();

        String regex= "([0-9]{2}) ([1-9][0-9]{9})$";
        Pattern p =Pattern.compile(regex);
        Matcher m = p.matcher(mobileNum);
        if (m.find()){
            System.out.println(mobileNum+" is valid");
        }else {
            System.out.println(mobileNum + " is not valid");
        }
    }

    public static void main(String[] args) {
        ValidMobileNum validMobileNum= new ValidMobileNum();
        validMobileNum.checkMobileNo();
    }
}
