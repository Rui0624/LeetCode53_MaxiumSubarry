
public class Solution {
	public int maxSubArray(int[] nums) {
        int t = 0;
        int res = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
//        	if(t + nums[i] >= t){
//        		t += nums[i];
//        	}else{
//        		t = nums[i];
//        	}
        	
        	t = Math.max(t + nums[i], nums[i]);
        	
        	res = Math.max(res, t);
        }
        
        return res;
    }
}
