package week02_09_17_2022;

public class ConverMinutesToYearAndDay {
    public static void main(String[] args) {
int minutes = 3456789;
int hours=60;
int days= 24;
int minInAYear=(60*24*365);
int year= minutes/minInAYear;

double years1=minutes/(24*365*60);
double years2= ((minutes/hours)/ years1);
        System.out.println("minInAYear = " + minInAYear);
        System.out.println(years1);
        int remainderMinutes = minutes%minInAYear;
        System.out.println("remainderMinutes = " + remainderMinutes);



    }
}
