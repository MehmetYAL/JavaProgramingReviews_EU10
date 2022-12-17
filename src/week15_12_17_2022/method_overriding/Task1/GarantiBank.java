package week15_12_17_2022.method_overriding.Task1;

public class GarantiBank extends Bank{



    public void calculateTheInterest() {

        super.calculateTheInterest();
        System.out.println(getCapital() * 8 / 100);
    }


}
