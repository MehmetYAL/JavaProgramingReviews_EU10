package week18_01_07_2023;

public class CustomArithmeticException extends RuntimeException{

    public CustomArithmeticException(String message) {
        super(" You have an error with divide with zero");
    }
}
