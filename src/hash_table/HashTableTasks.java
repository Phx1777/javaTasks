package hash_table;

import java.util.HashMap;

public class HashTableTasks {

    public static void main(String[] args) {

    }

    public static boolean checkKey(HashMap<String, String> map, String key) {
        return map.containsKey(key);
    }

    public static boolean checkValue(HashMap<String, String> map, String value) {
        return map.containsValue(value);
    }

    public static HashMap<String, String> copy(HashMap<String, String> map) {
        return new HashMap<>(map);
    }

    public static HashMap<Character, Integer> countLetters(String text) {
        HashMap<Character, Integer> myHashMap = new HashMap<>();
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (myHashMap.containsKey(c)) {
                myHashMap.put(Character.toLowerCase(c), myHashMap.get(c) + 1);
            } else {
                myHashMap.put(Character.toLowerCase(c), 1);
            }
        }
        return myHashMap;
    }

    public static int[] findDuplicates(int[] array) {
        java.util.Set<Integer> duplicates = new java.util.HashSet<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicates.add(array[i]);
                }
            }
        }

        return duplicates.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static String get(HashMap<String, String> map, String key) {
        return map.get(key);
    }

    public static void printKeys(HashMap<String, String> map) {
        java.util.Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
    }

    public static void printValues(HashMap<String, String> map) {
        for (String values : map.values()) {
            System.out.println(values);
        }
    }

    public static void removeKeys(HashMap<String, String> map, String[] keys) {
        for (String getKeys : keys) {
            map.remove(getKeys);
        }
    }

    public static void reverse(HashMap<String, String> map) {
        HashMap<String, String> inverse = new HashMap<>();

        for (java.util.Map.Entry<String, String> entry : map.entrySet()) {
            inverse.put(entry.getValue(), entry.getKey());
        }
        map.clear();
        map.putAll(inverse);
    }

    public static void set(HashMap<String, String> map, String key, String value) {
        map.put(key, value);
    }

    public static HashMap<String, Integer> wordFreq(String text) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int max = 0;
        String str = null;
        String[] array = text.toLowerCase().replaceAll("[(!?:;,.)]", "").split("\\s+");
        for (String word : array) {
            int f = map.getOrDefault(word, 0) + 1;
            map.put(word, f);
            if (f > max) {
                max = f;
                str = word;
            }
        }
        return map;
    }

}
