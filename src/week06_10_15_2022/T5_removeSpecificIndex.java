package week06_10_15_2022;

public class T5_removeSpecificIndex {
    public static void main(String[] args) {
        String word="Adamm";
        int index=3;
        String temp="";
        for (int i = 0; i <word.length() ; i++) {
            if (i==index)
                continue;
            temp+=word.charAt(i);


        }
        System.out.println(temp);


        /*        Task 5: Given a non-empty string and an int n, return a new string
         where the char at index n has been removed.
         The value of n will be a valid index of a char in the original string
         (i.e. n will be in the range 0..str.length()-1 inclusive).
input:
 String word="Adamm";
 int index=3;
 output:
 Adam
         */
    }
}
