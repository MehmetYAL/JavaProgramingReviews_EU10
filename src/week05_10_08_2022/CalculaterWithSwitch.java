package week05_10_08_2022;

import java.util.Scanner;

public class CalculaterWithSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter first number");
        double num1=input.nextDouble();

        System.out.println("please enter second number");
        double num2=input.nextDouble();

        System.out.println("please enter your operator");
        char operator=input.next().charAt(0);
        double result=0;
        switch (operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '/':
                result=num1/num2;
                break;
            case '*':
                result=num1*num2;
                break;
            default:
                System.out.println("operator is wrong");


        }
        System.out.println(result);
    }
}
