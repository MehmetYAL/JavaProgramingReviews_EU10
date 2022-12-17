package week10_11_12_2022;

public class Task1_FindTheSenetence {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        getsentence(str);
    }

    private static void getsentence(String str) {
        String temp="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
           /* if (('a'<=ch&&ch<='z') || ('A'<=ch&&ch<='Z')){
                temp+=ch;

            }//alpahebtic is for latin alphabet isAlphabetic()
            //if we use other aplhabet than we can use isLetter()*/
            if (Character.isUpperCase(ch))
                temp+=' ';
            if (Character.isLetter(ch)){
                temp+=ch;
            }

        } System.out.println(temp);
    }
}
/*
Task 1 : Find the word

                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                    Write a method that returns : Welcome To Core Java
 */