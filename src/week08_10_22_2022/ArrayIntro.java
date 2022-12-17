package week08_10_22_2022;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] arrayName={1,2,3,4,5,6};// if we know elements of Array

        //if we dont know the elements, we have to define size of array
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------------");
        char[] letter={'a','b','c','d'};
        System.out.println(Arrays.toString(letter));
        //to call spescific index
        System.out.println(letter[2]);//will call array index number of2 which is "c"
int[] arr3={1,2,3};
int[] arr4={2,1,3};
        System.out.println(Arrays.equals(arr3,arr4));

    }
}
