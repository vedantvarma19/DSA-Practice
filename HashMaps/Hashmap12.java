public class Hashmap12 {
    
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (counts.containsKey(num) && counts.get(num) > 0) {
                counts.put(num, counts.get(num) - 1);
                result.add(num);
            }
        }

        int ans[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;

    }
}


// Approach 2 by sorting two arrays 

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){ 
            return intersect(nums2,nums1); 
        }
        List<Integer> result = new ArrayList<>(); 

        Arrays.sort(nums1);
        Arrays.sort(nums2); 

        int i=0,j=0; 
        while(i<nums1.length && j < nums2.length){ 
            if(nums1[i] == nums2[j]){ 
                result.add(nums1[i]);
                i++;
                j++; 
            } else if ( nums1[i] > nums2[j]){ 
                j++ ; 
            } else { 
                i++ ;
            }
        }

        int ans[] = new int[result.size()];
        for(int idx =0; idx<result.size(); idx++){ 
            ans[idx]=result.get(idx); 
               }
               return ans ;        }
    }
