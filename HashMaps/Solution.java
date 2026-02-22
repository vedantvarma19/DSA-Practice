public class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map <Integer, Integer> Freq = new HashMap<>(); 
        for(int num : nums ){ 
            Freq.put(num,Freq.getOrDefault(num,0)+1);
        }

        Map<Integer,Integer> FreqCount = new HashMap<>(); 
        for(int f: Freq.values() ){ 
            FreqCount.put(f,FreqCount.getOrDefault(f,0)+1);
        }

        for(int num : nums ){ 
            if(FreqCount.get(Freq.get(num))==1){
                return num ; 
            }

        }
      return -1;   
    }
} 
