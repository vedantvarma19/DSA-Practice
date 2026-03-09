public class Arrays8{

    // https://leetcode.com/problems/maximum-product-subarray/-0.0
    
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int min = nums[0];
        int max = nums[0];
        int result = max;

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int temp = Math.max(cur, Math.max(cur * max, cur * min));
            min = Math.min(cur, Math.min(cur * max, cur * min));
            max = temp;

            result = Math.max(result, max);
        }
        return result;
    }
} 
