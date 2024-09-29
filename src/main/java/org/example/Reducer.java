package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reducer {
  public Map<String, Integer> reduce(Map<String, List<Integer>> groupedValue){
      Map<String, Integer> result = new HashMap<>();
      for (Map.Entry<String, List<Integer>> group : groupedValue.entrySet()) {
          String url = group.getKey();
          List<Integer> values = group.getValue();
          int sum = values.stream().mapToInt(Integer::intValue).sum();
          result.put(url, sum);
      }
      return result;
  }
}
