package Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class RearrangeAString {

    public static void main(String[] args) {
        System.out.println(arrangeString("ABUDEX1245"));
    }
    public static String arrangeString(String s)
    {
        StringBuilder sb = new StringBuilder();
        int resultSum=0;
        for (int i=0;i<s.length();i++){
            if((int)s.charAt(i)<65){
                resultSum=resultSum+Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        char tempArray[] = sb.toString().toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray) + resultSum;
    }
}
