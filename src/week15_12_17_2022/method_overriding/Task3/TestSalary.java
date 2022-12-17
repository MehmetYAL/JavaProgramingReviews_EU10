package week15_12_17_2022.method_overriding.Task3;

public class TestSalary {
    public static void main(String[] args) {

        Employee employee=new Employee();
        Manager manager=new Manager();

        System.out.println(employee.salary());

        System.out.println("========================");

        System.out.println(manager.salary());
    }
}
