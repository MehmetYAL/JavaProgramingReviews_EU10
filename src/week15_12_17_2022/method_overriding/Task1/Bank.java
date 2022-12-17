package week15_12_17_2022.method_overriding.Task1;

public class Bank {

    private int capital=10000;
    public int getCapital(){
        return capital;
    }
//how we can get classname: getClass().getSimpleName()
    public void calculateTheInterest(){
        System.out.println("Interest of the "+getClass().getSimpleName());
    }
}
