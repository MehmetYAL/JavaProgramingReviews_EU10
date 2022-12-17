package week04_10_01_2022;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter one integer number");
        int intValue=scan.nextInt();
        System.out.println("intValue = " + intValue);
scan.close();
    }

}
