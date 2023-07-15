package com.assignment.Streams;

import java.util.*;

public class DataStructureClass {

//    input array ["da", "rope", "feet", "da", "ropes", "rope", "da"], query array ["da", "rope", "feet", "cup"], result should look like : [3, 2, 1, 0]

    static void numOfElementInInput() {
        List<String> input = Arrays.asList("da", "rope", "feet", "da", "ropes", "rope", "da");
        List<String> query = Arrays.asList("da", "rope", "feet", "cup");

        Map<String, Integer> queryMap = new HashMap<>();
        query.forEach(str -> queryMap.put(str, 0));

        for (String str : input) {
            if (queryMap.containsKey(str)) {
                queryMap.put(str, queryMap.get(str) + 1);
            }
        }
        System.out.println(queryMap.values());

    }

    public static void main(String[] args) {

        numOfElementInInput();
    }
}
