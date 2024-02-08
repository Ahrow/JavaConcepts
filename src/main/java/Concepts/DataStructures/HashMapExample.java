package Concepts.DataStructures;

import java.util.HashMap;

public class HashMapExample {
    /**
     * Keys and Values in HashMap are objects
     * Not allowed to use primitive types i.e: int, boolean etc...,
     * Instead use: wrapper class: Integer, Boolean, Character, Double etc...
     * */
    public static void main(String[] args) {
        // Create a HashMap object called games
        HashMap<Integer, String> games = new HashMap<Integer, String>();
        // Add keys and values to hashmap called games
        games.put(1, "Counter-Strike");
        games.put(2, "Half-Life");
        games.put(3, "Halo");
        games.put(4, "Mario");

        // Print keys | .keySet()
        for (Integer i : games.keySet()) {
            System.out.println(i);
        }
        // Print values | .values()
        for (String i : games.values()) {
            System.out.println(i);
        }
        // Print keys and values
        for (Integer i : games.keySet()) {
            System.out.println("Key: " + i + " Value: " + games.get(i));
        }
        // Count number of items in hashmap | .size()
        System.out.println("Nr of games in hashmap: " + games.size());
    }
}
