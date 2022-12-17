package week15_12_17_2022.method_overriding.Task1;

public class TestInterest {
    public static void main(String[] args) {

        Bank bank=new Bank();
        bank.calculateTheInterest();

        Akbank akbank=new Akbank();
        akbank.calculateTheInterest();

        System.out.println("==========================================");

        GarantiBank garantiBank=new GarantiBank();
        garantiBank.calculateTheInterest();

        System.out.println("================================");

        INGBank ingBank=new INGBank();
        ingBank.calculateTheInterest();
    }
}
