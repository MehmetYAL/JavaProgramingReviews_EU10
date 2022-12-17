package week09_11_05_2022;

public class MultiDimensionArrayIntro {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {10, 20, 30};
        int[] thirdArray = {11, 22, 33};

        int[][] twoDmnsArray = {
                {1, 2, 3},//first array
                {4, 5, 6},//second arrray
                {7, 8, 9}//third array
        };
        int[][] arr2D = {firstArray, secondArray, thirdArray};

        System.out.println(twoDmnsArray[0][1]);//ilk kare hangi array olduguna gider
        //2.kare o array in hangi indexi oldugunu gosterir. burada ilk array da 4 noya isaret eder

        int[][] twoDimenArray = {
                // 0 1  2
                {1, 2, 3},   //first array // 0
                {4, 5, 6},  //second array //1
                // 0 1 2 3
                {7, 8, 9, 10} //third array //2

        };
        System.out.println(twoDimenArray[2][2]);
        //3 row number
        for (int i = 0; i < twoDimenArray.length; i++) { // in order to go to array one by one
            System.out.println(i + 1 + ". array ");
            //column number
            for (int j = 0; j < twoDimenArray[i].length; j++) { // this is for finding element inside inner array
                System.out.println(twoDimenArray[i][j]);

            }
            System.out.println("=============");
        }
    }
}