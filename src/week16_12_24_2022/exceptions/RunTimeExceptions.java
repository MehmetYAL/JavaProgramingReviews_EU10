package week16_12_24_2022.exceptions;

import week11_11_19_2022.custom.Employee;

public class RunTimeExceptions {
    //static Employee employee; //we need to make it static in oreder to use inside main method which is static

    public static void main(String[] args) {
//ArithmeticException
        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println(60 / i);  //java.lang.ArithmeticException
            }
        } catch (Exception e) {
            //e.printStackTrace();//simple message
            e.getMessage(); //detailed message
        }
//NullPointerException
//You can not reach instance variables or methods from the static block or method
        //java.lang.NullPointerException if you want to reach object fields or methods you have  to initialize it. I
        // mean creating object
        //  System.out.println(employee.salary());

        //NumberFormatException
        String str="Adam 123.";
        //    String s=str.substring(str.indexOf(" ")+1);
        //  System.out.println(Integer.parseInt(s));

        //ArrayIndexOutOfBoundsException

        int[] array={1,2,3};

        //  System.out.println(array[3]); //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        //StringIndexOutOfBoundsException
        String name="Adam";

        //  System.out.println(name.charAt(4)); //java.lang.StringIndexOutOfBoundsException: String index out of range: 4

    }
}
