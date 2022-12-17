package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        //how to create an array list
        ArrayList<String> cities=new ArrayList<>();

        cities.add("London");// return boolean
        cities.add("Paris");
        cities.add("Paris");
        cities.add("Istanbul");
        System.out.println(cities);
        //how to add element to the begining

        cities.add(0,"Mardin");
        System.out.println(cities);

        //how to get element
        System.out.println(cities.get(1));
        System.out.println(cities);//London

        //how to update your element-----set method
        cities.set(2,"Prag");
        System.out.println(cities);

        //how to learn idex of element------
        System.out.println(cities.indexOf("Paris"));//if it is not exist you are getting -1

        //how to remove element
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.remove(new Integer(5));
        System.out.println(numbers);

        //balk operations
        //removeAll,retainAll,removeIf
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Mehmet","Alper","Melih"));

        System.out.println("=============================================");

        numbers.removeIf(each-> each<3);// instead of each we can write anything--k or p


    }
}
