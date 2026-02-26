package LeetCode_Daily_Challenge;

public class problem1 {

    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/description/?envType=daily-question&envId=2026-02-26

    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        
        // Traverse from right to left (ignore first bit)
        for (int i = s.length() - 1; i > 0; i--) {
            
            int bit = s.charAt(i) - '0';
            
            if (bit + carry == 1) {
                // odd case
                steps += 2;   // add 1 + divide by 2
                carry = 1;    // carry generated
            } else {
                // even case
                steps += 1;   // just divide by 2
            }
        }
        
        // If carry remains, one extra step
        return steps + carry;
    }
}
    
}
