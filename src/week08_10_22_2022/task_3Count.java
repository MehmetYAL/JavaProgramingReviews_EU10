package week08_10_22_2022;

public class task_3Count {
    public static void main(String[] args) {
        String[] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        int count=0;
        for (String letter : names) {
            String first=letter.charAt(0)+"";
            String last=letter.charAt(letter.length()-1)+"";
            if (first.equalsIgnoreCase(last))
            count++;

        }
        System.out.println(count);

    }
}
/*
Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter
                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"
                Output : 4
 */