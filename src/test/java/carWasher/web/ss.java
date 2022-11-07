package carWasher.web;

import org.junit.Test;
import org.springframework.security.core.parameters.P;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class ss {

    @Test
    public void name() {
        Map<Integer, Integer> integerIntegerHashMap = Map.of(1, 2, 2, 1,3,2,5,0);

        int[] ints = new Solution().topKFrequent(new int[]{1, 2}, 2);

//        List<Integer> collect = integerIntegerHashMap.entrySet()
//                .stream()
//                .collect(Collectors.toMap(
//                        Map.Entry::getValue, Map.Entry::getKey, (kq, k2) -> kq,
//                        () -> new TreeMap<Integer,Integer>(Comparator.comparing(( Integer i1)->{
//                            return i1 ;
//                        }).reversed())
//                ))
//                .entrySet()
//                .stream()
//                .limit(2)
//                .map(Map.Entry::getValue)
//                .mapToInt(f->f.intValue())
//                .toArray();
//        List<Integer> integers = List.of(2, 1);
//        assertEquals(integers, collect);
//

    }
}
class Solution {


    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else{
                map.put(nums[i],1);
            }
        }

        return  map.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        h->h.getValue(), integerIntegerEntry -> {
                            ArrayList<Integer> integers = new ArrayList<>();
                            integers.add(integerIntegerEntry.getKey());
                            return integers;
                        },
                        (kq, k2) -> {
                            kq.addAll(k2);
                            return kq;
                        },
                        () -> new TreeMap<>(Comparator.comparing(( Integer i1)->{
                            return i1 ;
                        }).reversed())
                ))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(g->g.stream())
                .limit(2)
                .mapToInt(f->f.intValue())
                .toArray();
    }
}