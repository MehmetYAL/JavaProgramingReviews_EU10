package week12_11_26_2022.student;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Mehmet");
        System.out.println(student1);
        student1.age=45;
        student1.batchNumber =45;
        System.out.println(student1);
    }
}
