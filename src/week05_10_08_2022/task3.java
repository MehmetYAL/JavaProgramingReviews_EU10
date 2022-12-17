package week05_10_08_2022;

public class task3 {
    public static void main(String[] args) {
        //ask 3: Given a string, return a version without the first and last char,
        // so "Hello" yields "ell".
        //      Hint: The string length will be at least 2.

        String str="Cydeo";
        str=str.substring(1,str.length());
        System.out.println(str);
    }
}
