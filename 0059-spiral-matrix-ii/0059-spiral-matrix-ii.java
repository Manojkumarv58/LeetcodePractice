class Solution {
    public int[][] generateMatrix(int n) {
       
    int[][] matrix = new int[n][n];
    int value = 1, top = 0, bottom = n- 1, left = 0, right = n - 1;
    while (top <= bottom && left <= right) {
        for (int i = left; i <= right; i++) matrix[top][i] = value++;
        top++;
        for (int i = top; i <= bottom; i++) matrix[i][right] = value++;
        right--;
        for (int i = right; i >= left; i--) matrix[bottom][i] = value++;
        bottom--;
        for (int i = bottom; i >= top; i--) matrix[i][left] = value++;
        left++;
    }
    return matrix;
}

        
    }
   
