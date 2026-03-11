class Arrays10 {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/ 

    
    public int removeDuplicates(int[] nums) {
        int i = 1 ; 
        for ( int j = 1; j <nums.length; j++){ 
            if(nums[j-1]!= nums[j]){ 
                nums[i] = nums[j]; 
                i++; 
            }
        }
        return i ; 
        
    }
}