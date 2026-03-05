package Arrays;

// problem description : Input: nums = [12,345,2,6,7896]
/* Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits. */ 

/* Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105 */

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Arrays1 {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {
            int digit = 0;

            while (num > 0) {
                num /= 10;
                digit++;
            }
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;

    }
} 
