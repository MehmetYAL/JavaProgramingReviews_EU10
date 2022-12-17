package week03_09_24_2022;

public class IntroPreIncrementDecrement {
    public static void main(String[] args) {
        //
        //          int a=5;
        //          print a;
        //          print the ++a;
        //          print the --a;

        int a=5;
        System.out.println("a = " + a);
        System.out.println(++a);// a will be 6
        System.out.println(a++);// a will be 6//but in next line a will be 7
        System.out.println(a);//value became 7
        int x=10;
        int number=x++ + 100;
        System.out.println("number = " + number);
        int number2=++x +100;
        System.out.println("number2 = " + number2);

    }
}
