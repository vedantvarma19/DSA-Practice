public class Array14 {

    // https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/


    public int[] replaceElements(int[] arr) {

        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}