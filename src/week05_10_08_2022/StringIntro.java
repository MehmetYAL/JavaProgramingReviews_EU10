package week05_10_08_2022;

public class StringIntro {
    public static void main(String[] args) {

        String word="Adam";
        System.out.println(word.indexOf("d"));
        System.out.println(word.indexOf("da"));

        String sentence="java programming language";
        System.out.println(sentence.indexOf("programming"));

        String sentence1="java is java";
        System.out.println(sentence1.indexOf("java"));
        System.out.println(sentence1.lastIndexOf("java"));

        System.out.println("---------------------------------------------");
        //repeat :to multiply repeating

        String str4="Adam ";
        System.out.println(str4.repeat(4));
        System.out.println("==============================");

        String sentence3="java is a good language";
        System.out.println(sentence3.startsWith("java"));
        System.out.println(sentence3.endsWith("good"));

        //contains method is using for checking the given char is in string or not
        System.out.println("--------------------");
        String sentence4="java is java";




    }
}
