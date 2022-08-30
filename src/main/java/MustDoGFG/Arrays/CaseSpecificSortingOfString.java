package MustDoGFG.Arrays;

import java.util.Arrays;

public class CaseSpecificSortingOfString {

    public static String caseSort(String str)
    {
        // Your code here
        String lower="";
        String upper="";
        for(char c:str.toCharArray()){
            if (Character.isUpperCase(c)){
                upper=upper+c;
            }
            else lower=lower+c;
        }
        char[] upperArray = lower.toCharArray();
        char[] lowerArray = upper.toCharArray();
        Arrays.sort(upperArray);
        Arrays.sort(lowerArray);
        StringBuilder string= new StringBuilder();
        int i=0,j=0;
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) string.append(lowerArray[i++]);
            else string.append(upperArray[j++]);
        }
        return string.toString();
    }
}
