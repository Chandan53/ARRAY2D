package ARRAY2D;

//Q --> search the key in a sorted matrix

public class array2d_9 {
    public static void Search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]== key){
                    System.out.print(" key present at a index (" + i + "," + j + ")" );
                }
                
                
            }
            
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,49},{32,33,39,50}};
        Search(matrix,39);
    }
    
}
