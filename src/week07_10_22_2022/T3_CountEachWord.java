package week07_10_22_2022;

public class T3_CountEachWord {
    public static void main(String[] args) {
        String names = "Adam Adam Barry Aysun Aysun";

        String adam="Adam";
        String result="";
        for (int i = 0; i <names.length() ; i++) {
            char ch=names.charAt(i);
            if (ch!=' '){result+=ch;
                continue;

        }




        int count=0;
        while (names.contains(adam)){
            count++;
        names=names.replaceFirst(adam,"");}
        System.out.println(count);
    }
}}
/*
Task 3: Count each name in sentence.

    input :

  String names = "Adam Adam Barry Aysun Aysun";

    output:

    Adam-2 Barry-1 Aysun-2
 */