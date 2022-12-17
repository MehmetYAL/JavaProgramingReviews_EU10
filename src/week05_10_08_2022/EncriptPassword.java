package week05_10_08_2022;

public class EncriptPassword {
    public static void main(String[] args) {
        String password = "cydeo";
        char encript='x';
        String encPassWord="";

        for (int i = 0; i < password.length(); i++) {encPassWord+=""+password.charAt(i)+encript;


        }
        System.out.println(encPassWord);
    }
}