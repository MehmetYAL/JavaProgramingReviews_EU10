package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class T1_findingHiddenNumbers {
    public static void main(String[] args) {
        Random random=new Random();
        int hiddenNumber = random.nextInt(10) + 1;

Scanner input=new Scanner(System.in);
        boolean flag=true;
        do {System.out.println("enter number and letters");
            int searchNum=input.nextInt();
            if (searchNum==hiddenNumber){
                System.out.println("you find a number congrat");
            }
        }while (flag);
        //while (){}

        }

    }

/*
Task 1: Find the number that given a hidden number between 1 and 100 randomly created.

 Hint:   Random random=new Random();

        int hiddenNumber = random.nextInt(10) + 1;
 */