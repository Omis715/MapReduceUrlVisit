package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "yourfile.log"; // only field you have to update
        StringBuilder content = new StringBuilder();
        List<Map.Entry<String, Integer>> mappedData = new ArrayList<>();
        CustomMap mapper = new CustomMap();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                mappedData.addAll(mapper.map(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Shuffle and Sort
        ShuffleAndSort shuffleAndSort = new ShuffleAndSort();
        Map<String, List<Integer>> groupedData = ShuffleAndSort.groupByKeys(mappedData);
        // Reduce
        Reducer reducer = new Reducer();
        Map<String, Integer> result = reducer.reduce(groupedData);
        Map<String, Integer> sortedMap = result.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
                ));
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            int i = 1;
            System.out.println("Page " + entry.getKey() + " demandees " + entry.getValue()+ " fois.");
        }
    }
}