package week08_10_22_2022;

public class Task3MultipleWords {
    public static void main(String[] args) {

        String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] words=str.split(", ");
        for (String word2 : words) {
            if (word2.contains(" ")){
                System.out.println(word2);
            }

        }

    }
}
/*
Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer
 */