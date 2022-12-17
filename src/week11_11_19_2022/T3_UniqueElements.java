package week11_11_19_2022;

import java.util.ArrayList;

public class T3_UniqueElements {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5,5};
        int[] second = {4, 5, 6};

        ArrayList<Integer> result = uniqueElements(first, second);
        System.out.println(result);


    }
    public static ArrayList<Integer> uniqueElements(int[] first,int[] second){
        ArrayList<Integer> result=new ArrayList<>();
        for (int i : first) {
            if (!result.contains(i))
            result.add(i);

        }
        for (int i : second) {
            if (!result.contains(i))//checking each element from second if it is not same number put inthe result
            result.add(i);
        }return result;
    }
}
/*
Task 3 :
Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.
first array :1,2,3,4,5
second array :4,5,6
output:
1,2,3,4,5,6
 */