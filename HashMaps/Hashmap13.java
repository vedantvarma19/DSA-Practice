import java.util.HashSet;
import java.util.Set;

class Solution {

    // Approach 1 : using map 
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>(); 

        for( int i = 0 ; i < nums.length; i++ ){ 
            if(map.containsKey(nums[i])){ 
                int diff = i - map.get(nums[i]); 
                if (diff <= k ){ 
                    return true ; 
                }
            }
            map.put(nums[i],i);
        }
        return false ; 
    }
}


// Approach 2 : using sliding window concept ( Hashset )

Class Solution { 
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> window = new HashSet<>(); 

    for(int i=0; i<nums.length; i++){ 
        if(window.contains(nums[i])){ 
            return true ; 
        }
        window.add(nums[i]); 

        if(window.size()>= k ){ 
            window.remove(nums[i-k]);
        }
    }
    return false; 
}
}