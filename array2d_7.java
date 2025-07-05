package ARRAY2D;

public class array2d_7 {
    public static void count(int matrix[][]){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;

                }
                
                
            }
            
        }
        System.out.println(" total count of number 7 in 2d array is " + count);
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4,7},
                        {7,7,6,5,4}};
        count(matrix);
    }
    
}
