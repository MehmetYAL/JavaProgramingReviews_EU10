package week18_01_07_2023;

public class CustomExceptionExample {
    public static void main(String[] args) {
       try{
        System.out.println(3/0);
       }catch ( Exception e)
        {
            throw new CustomArithmeticException(" You can not divide with zero");
        }

    }
}
