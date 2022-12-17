package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class T2_MergeIntoArray {
    public static void main(String[] args) {
        ArrayList<Integer> first=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> second=new ArrayList<>(Arrays.asList(4,5,6));
        int[] merge=mergeArrays(first,second);
        System.out.println(Arrays.toString(merge));
    }

    public static int[] mergeArrays(ArrayList<Integer> first,ArrayList<Integer> second){
        int[] result=new int[first.size()+ second.size()];
        int index=0;
        for (Integer each : first) {
            result[index++]=each;

        }
        for (Integer each2 : second) {
            result[index++]=each2;

        }return result;
    }
}
/*
Task 2 :

Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.
input:
first arraylist :1,2,3
second arraylist :4,5,6
output:
1,2,3,4,5,6
 */
