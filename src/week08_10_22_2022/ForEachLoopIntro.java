package week08_10_22_2022;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,};
        for (int each : numbers) {
            System.out.println(each);
        }
//toCharArray()

        String str="Mehmet";
        char[] letter=str.toCharArray();
        System.out.println(Arrays.toString(letter));

        //split----Array--------
        String sen="Java is programming language";
        String[] s=sen.split(" ");
        for (String word : s) {
            System.out.println(word);
        }

    }
}
