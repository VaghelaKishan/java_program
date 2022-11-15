package com.company;

public class KD_ch3_ps3 {
    public static void main(String[] args) {
        // Question 1
        String name = "Kishan Vaghela";
        name = name.toLowerCase();
        System.out.println(name);

        // Question 2
        String text = "to lower case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Question 3
        String letter = "Dear <|name|> , Thanks a lot!";
        letter = letter.replace("<|name|>", "Kishan");
        System.out.println(letter);

        // Queston 4
        String mystring = " This string contains     double and  tripal spaces";
        System.out.println(mystring.indexOf("   "));
        System.out.println(mystring.indexOf("  "));

        // Question 5
        String letter2 = "Dear kishan,\n\tthis java course is nice.\n\t\tthanks!";
        System.out.println(letter2);

    }

}
