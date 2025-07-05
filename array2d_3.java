package ARRAY2D;

public class array2d_3 {
    public static void  sperial(int matrix[][]){
        // 4 variables
        int start_row=0;
        int start_column=0;
        int end_row=matrix.length-1;
        int end_column=matrix[0].length-1;

        while(start_row<=end_row && start_column<=end_column){
            // top
            for(int j=start_column;j<=end_column;j++){
                System.out.println(matrix[start_row][j] + " ");
            }
            // right

            for(int i=start_row+1;i<=end_row;i++){
                System.out.println(matrix[i][end_column] + " ");
            }

            // bottom
            for(int j=end_column-1;j>=start_column;j--){
                
                System.out.println(matrix[end_row][j]);
            }
            // left
            for(int i=end_row-1;i>=start_row+1;i--){
                System.out.println(matrix[i][start_column]);
            }
            start_row++;
            start_column++;
            end_row--;
            end_column--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix [][]= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        sperial(matrix);

    }
    
}
