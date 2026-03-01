//  https://leetcode.com/problems/4sum-ii/description/

import java.util.HashMap;

public class HashMap19{ 
     public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer , Integer> SumMap = new HashMap<>(); 

        int n = nums1.length; 
        for( int i=0; i<n; i++){ 
            for( int j=0; j<n ; j++){ 
                int sum = nums1[i]+nums2[j];
                SumMap.put(sum,SumMap.getOrDefault(sum,0)+1);

                }
            }

            int count = 0 ; 
            for( int i=0; i<n; i++){ 
                for (int j=0; j<n; j++){ 
                count += SumMap.getOrDefault(-(nums3[i]+nums4[j]),0);
                }
            }
            return count ; 
        }
}