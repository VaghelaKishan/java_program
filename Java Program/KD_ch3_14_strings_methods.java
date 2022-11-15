package com.company;

import java.net.SocketTimeoutException;
import java.util.Locale;
import java.util.SortedMap;

public class KD_ch3_14_strings_methods {
    public static void main(String[] args) {
        String name = "Kishan";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedstring = "      kishan        ";
        System.out.println(nonTrimmedstring);

        String trimmedstring = nonTrimmedstring.trim();
        System.out.println(trimmedstring);

        // SubString
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,5));

        // Replace
        System.out.println(name.replace('n','l'));
        System.out.println(name.replace("han","loo"));

        //Start with & end with
        System.out.println(name.startsWith("Kis"));
        System.out.println(name.endsWith("an"));

        // char at
        System.out.println(name.charAt(4));

        // index of
        System.out.println(name.indexOf("sh"));
        System.out.println(name.lastIndexOf("a"));

        //equals
        System.out.println(name.equals("Kishan"));
        System.out.println(name.equalsIgnoreCase("kisHAn"));

        // Escape -- \n , \t , \\ , \" etc.
        System.out.println("I am escape sequence \" double quote");
    }
}
