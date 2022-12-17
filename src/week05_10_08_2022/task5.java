package week05_10_08_2022;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the color name");
        String colour=input.next();
        String result="";
        if ( colour.startsWith("red")) {result="red";

        } else if (colour.startsWith("blue")) {result="blue";

        }else {
            System.out.println(" ");
        } System.out.println(result);


        //ask 4: Given a string, if the string begins with "red" or "blue" print
        // that color string, otherwise print the empty string.
        //
        //     *                 input :"redxx" → "red"
        //     *                 input :"xxred" → ""
        //     *                 input :"blueTimes" → "blue"
        //
        //2
        //
        //1
        //
        //You do not have permission to send messages in this channel.
    }
}
