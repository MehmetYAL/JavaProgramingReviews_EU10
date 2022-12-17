package week11_11_19_2022.custom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Schooll {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        Student student1=new Student("Mehmet",'M','A', LocalDate.of(1976,8,22),1903);
        Student student2=new Student("Erdem",'M','B', LocalDate.of(1990,2,2),2222);
        Student student3=new Student("Hale",'F','C', LocalDate.of(1996,6,2),2222);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        Student[] studentsA= {student1,student2,student3};
        //ArrayList<Student> result=
       // ArrayList<Student> result= getStudentsNameStartsWithA(students);

        //System.out.println(result);


    }

    public static ArrayList<Student> getStudentsNameStartsWithA(ArrayList<Student> students) {

        ArrayList<Student> result=new ArrayList<>();

        for (Student student : students) {

            if (student.name.startsWith("M")){
                result.add(student);
            }

        }

        return result;
    }
    }

