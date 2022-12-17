package week12_11_26_2022.statics;

public class BrowserUtils {

    public static String staticVaiable;
    public static void navigateUrl(String url){
        System.out.println("got to. "+url);
    }
    public static void search(String word){
        System.out.println(word+" is searching");
    }
}
