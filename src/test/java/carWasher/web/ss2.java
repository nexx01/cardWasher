package carWasher.web;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ss2 {

    @Test
    public void name() {
        int[] ints = {1,1,1,2,2,3};

        int[] actual = new Solution().topKFrequent(ints, 2);

        assertArrayEquals(new int[]{1,2},actual);

    }

    @Test
    public void name1() {
        int[] ints = {1};

        int[] actual = new Solution().topKFrequent(ints, 1);

        assertArrayEquals(new int[]{1},actual);
    }

    class Solution{
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
            ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
            int[] ans = new int[k];

            for (int x = 0; x < nums.length; x++) {
                arrayLists.add(new ArrayList<>());
            }

            for (int n : nums) {
                integerIntegerHashMap.put(n, integerIntegerHashMap.getOrDefault(n, 0) +1);
            }

            for (int n : integerIntegerHashMap.keySet()) {
                int freq = integerIntegerHashMap.get(n);
                arrayLists.get(freq-1).add(n);
            }

            int i = 0;
            for (int j = arrayLists.size() - 1; j >= 0 && i < k; j--) {
                if (arrayLists.get(j).size() > 0) {
                    for (int l = 0; l < arrayLists.get(j).size(); l++) {
                        ans[i] = arrayLists.get(j).get(l);
                        i++;
                    }
                }
            }
            return ans;
        }

    }
}
