class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
       int n = spells.length;
      int m = potions.length;
      int ans[]=new int[n];
      for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<m;j++){
            if(spells[i]*potions[j]>=success){
                count++;
            }
        }
        ans[i]=count;
         
      }
      return ans;
    }

}