package org.example;
import java.util.*;

public class CustomMap {
    public List<Map.Entry<String, Integer>> map(String line) {
        List<Map.Entry<String, Integer>> keyValuePairs = new ArrayList<>();
        String[] fields = line.split(" ");
        if (fields.length > 1) {
            String url = fields[6];  // Modify this based on the structure of your log
            keyValuePairs.add(new HashMap.SimpleEntry<>(url, 1));
        }
        return keyValuePairs;
    }
}
