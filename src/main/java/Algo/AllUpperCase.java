package Algo;

import java.util.ArrayList;

public class AllUpperCase {
    public static boolean isUpperCase(String s){
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isUpperCase) && s.chars().anyMatch(Character::isLowerCase) && s.chars().anyMatch(Character::isDigit);
    }

    public static String reverseSentence(String s){
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        for (String s1:split
             ) {
            StringBuilder sb1 = new StringBuilder(s1);
            sb.append(sb1.reverse());
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(isUpperCase("HelloWorld"));
//        System.out.println(isLowerCase("HelloWorld"));
//        System.out.println(isPasswordComplex("uk2612UK"));
          System.out.println(reverseSentence("I am Ujjwal"));
    }
}
