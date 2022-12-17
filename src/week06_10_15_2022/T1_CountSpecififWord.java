package week06_10_15_2022;

public class T1_CountSpecififWord {
    public static void main(String[] args) {
        String str="Java is java in everywhere is Java";
                                String word="Java";
                                int CntWord=0;
//int Lstr=word.length()-3;
        for (int i = 0; i <= str.length()-4; i++) {
            String str2=str.substring(i,i+4);
            if (str2.equalsIgnoreCase(word))
                CntWord++;
            }
            System.out.println(CntWord);
/*
for (int i = 0; i < word.length()-3; i++) {
            String eachSub = word.substring(i, i + 4);
            if (eachSub.equals("Java")) {
                frequency++;
 */

        }
        /*
        ask 1: Given a sentence which is string find word how many times repeats in it.

Hint: use substring with for loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
         */
    }
