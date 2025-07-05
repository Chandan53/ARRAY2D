package ARRAY2D;
import java.util.*;
// creating 2 d array and searching the key

public class array2d_2 {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key is present at index (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println(" key is not present  in the matrix");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]=new int [3][3];
        Scanner sc=new Scanner(System.in);
        
        int n=matrix.length;// ---> total no of rows
        int m=matrix[0].length;// ---> total no of columns

        // input
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        // output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,12);
    }

    
}
