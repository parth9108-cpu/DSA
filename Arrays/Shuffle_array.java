class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans=new int[2*n];
        for(int i=0;i<2*n;i+=2){
            ans[i]=nums[i/2];
        }
        int count=0;
        for(int j=1;j<2*n;j+=2){
            ans[j]=nums[n+count];
            count++;
        }
        return ans;
        

        }
    }