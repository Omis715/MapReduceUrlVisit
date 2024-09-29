package org.example;
import java.util.*;

public class ShuffleAndSort {
    public static Map<String, List<Integer>> groupByKeys(List<Map.Entry<String, Integer>> mappedData){
        Map<String, List<Integer>> groupedData = new HashMap<>();
        for(Map.Entry<String, Integer> entry : mappedData){
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(!groupedData.containsKey(key)){
                groupedData.put(key, new ArrayList<>());
            }
            groupedData.get(key).add(value);
        }
        return groupedData;
    }
}
