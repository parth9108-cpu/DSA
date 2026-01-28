class Solution {
    public int[] runningSum(int[] nums) {
        int x=nums.length;
        int[] ans=new int[x];
        ans[0]=nums[0];
        for(int i=1;i<x;i++){
            ans[i]=ans[i-1]+nums[i];
        }

        return ans;
    }
}