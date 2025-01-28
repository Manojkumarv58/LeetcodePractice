class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>(); 
        
        List<Integer> prevRow = null; 
        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1); 
                } else {
                    currentRow.add(prevRow.get(j - 1) + prevRow.get(j)); 
                }
            }
            
            triangle.add(currentRow); 
            prevRow = currentRow;    
        }
        
        return triangle;
    }
}