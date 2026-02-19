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