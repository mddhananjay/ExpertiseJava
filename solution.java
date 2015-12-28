package Example.DataStructures.com;

/**
 * Created by DHANANJAY on 22-Dec-15.
 * This is part of dhananjay's efforts to gain expertise in java
 */

import java.util.*;


public class solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char [] char_str = s.toCharArray();
        for(int i=0;i<char_str.length;i++){
            char_str[i]= (char) ((int)char_str[i]+k);
        }
        System.out.println(char_str);
    }
}