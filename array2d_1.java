package ARRAY2D;
import java.util.*;

public class array2d_1 {
    // data store in single dimensional is called 1D array
    // int arr[]={1,2,3,4};
    // data store in two dimensional is called 2D array
    // int arr[][]=[3][3];
    public static void main(String args[]){
        int matrix[][]=new int [3][3];
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        // output
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
