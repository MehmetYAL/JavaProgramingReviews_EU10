package week15_12_17_2022.method_overriding.Task3;

public class Manager extends Employee{
    public double salary(){
        return super.salary()+20000;
    }
}