class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=p[i];
        }
    

        
        
        

        
    }
}