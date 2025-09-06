class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;


        while(row< matrix.length && col >= 0 ){
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col]<target){

                row++;
            }else{

                col--;
            }
        }
        return false;
    }

}

//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false