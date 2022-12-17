package week05_10_08_2022;

public class task2 {
    public static void main(String[] args) {
        String str="Hello";
        int indexOfLastChar=str.length()-1;
        int indexOfSLastChar=str.length()-2;
        char last=str.charAt(indexOfLastChar);
        char beforelast=str.charAt(indexOfSLastChar);
        String lasttwo=""+beforelast+last;
        System.out.println(lasttwo+lasttwo+lasttwo);

        //ask 2: Create a logic print a new string made of 3 copies of the last 2 chars
        // of the original string.
        //
        //      Hint: The string length will be at least 2.

        String sentence3="Java is a hard programming language";

        sentence3=sentence3.replace("hard","easy");
        System.out.println(sentence3);
        System.out.println("-------------------------------------------");
        String sentence4="java is not same with java";
        System.out.println(sentence4.replaceFirst("java","Python"));
//if want to get some part of the string we need to use substring()
        System.out.println("-------------------------------------------------------");
        String sub="Cydeo";
        sub.substring(1,4);

    }
}
