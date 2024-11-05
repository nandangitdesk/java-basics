import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input elemnts in array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output of array
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//
//            System.out.println();
//        }


        //for search element in the array 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x){
                    System.out.println("x is found at locations (" + i + "," + j + ")");
                }
            }
        }

    }
}
