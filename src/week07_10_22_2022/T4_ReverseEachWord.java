package week07_10_22_2022;

public class T4_ReverseEachWord {
    public static void main(String[] args) {
        String str = "Adam come here";
        String result="";
       int adam=str.indexOf('A');
       String adam2=str.substring(adam,adam+4);
        //System.out.println(adam);
        //System.out.println(adam2);

        int come=str.indexOf('c');
        String come2=str.substring(come,come+4);

        int here=str.indexOf('h');
        String here2=str.substring(here,here+4);
        for (int i = adam2.length()-1; i >=0; i--) {
            result+=adam2.charAt(i);
        }
        String result2="";
        for (int i = come2.length()-1; i >=0 ; i--) {
            result2+=come2.charAt(i);

        }String result3="";
        for (int i = here2.length()-1; i >=0 ; i--) {
            result3+=here2.charAt(i);
        }
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println(result+" "+result2+" "+result3);
        /*
        Task 4: Reverse each word in a sentence.
      input:
     String str = "Adam come here";
    output:
    madA emoc ereh
         */
    }
}
