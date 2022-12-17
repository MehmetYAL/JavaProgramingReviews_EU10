package week12_11_26_2022.statics;

import static week12_11_26_2022.statics.BrowserUtils.*;

public class SearchInGoogle {
    public static void main(String[] args) {
        navigateUrl("Google");
        search("Mehmet");
        System.out.println(staticVaiable);
    }
}
