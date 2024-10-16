class Solution {
    public void rotate(int[][] matrix) {
        // transpose
          for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }


        // rotate by 90 || reversing each row
        for(int i=0;i<matrix.length;i++){
            int j=0;
            int k=matrix.length-1;
            while(j<k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
        }
        
    }
    
}