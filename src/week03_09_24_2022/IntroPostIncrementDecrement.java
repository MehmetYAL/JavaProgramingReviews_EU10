package week03_09_24_2022;

public class IntroPostIncrementDecrement {
    public static void main(String[] args) {
        /*
        Task 1 : Create a class which is "IntroPostIncrementDecrement" define a variable,
          int a=5;
          print a;
          print the a++;
          print the a--;
         */
int a=5;
        System.out.println(a);
        System.out.println("a = " + a);//variable name is also in the same line
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);

        System.out.println("-------------------------------");

        int b=10;

        System.out.println(b--);//first do action  we will print 10
        System.out.println(b--);//will print 9 and it will be 8 for nect statement
        System.out.println(b);
        b=b-1;// b-- //b-=1;


    }
}
