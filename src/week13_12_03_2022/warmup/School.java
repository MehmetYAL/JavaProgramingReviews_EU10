package week13_12_03_2022.warmup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
static ArrayList<Teacher> teachers=new ArrayList<>();
   static {


       Teacher teacher1=new Teacher("Muhtar","abc",'M', LocalDate.of(1990,07,22),1L);
       Teacher teacher2=new Teacher("Gurhan","abc",'M', LocalDate.of(1977,07,22),2L);
       Teacher teacher3=new Teacher("Aysun","abc",'F', LocalDate.of(1989,07,22),3L);
       Teacher teacher4=new Teacher("Saim","abc",'M', LocalDate.of(1967,07,22),4L);
       Teacher teacher5=new Teacher("Asya","abc",'F', LocalDate.of(1986,07,22),5L);
       Teacher teacher6=new Teacher("Halim","abc",'M', LocalDate.of(1995,07,22),5L);


       teachers.addAll(Arrays.asList(teacher1,teacher2,teacher3,teacher4,teacher5,teacher6));
   }











    public static void main(String[] args) {
        System.out.println(teachers);
       ArrayList<Teacher> result= getTeachersNameStartWith("M");
        System.out.println(result);

        ArrayList<Teacher> female=getTeacherByGender('F');
        System.out.println(female);
    }

    private static ArrayList<Teacher> getTeacherByGender(char gender) {
        ArrayList<Teacher> result=new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.gender==gender)result.add(teacher);
        }return result;
    }

    private static ArrayList<Teacher> getTeachersNameStartWith(String prefix) {
        ArrayList<Teacher> result=new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.name.startsWith(prefix))

                result.add(teacher);

        }return result;
    }
}
/*
 2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the last name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a methot in School class then find the teachers born in 1967 year
 */