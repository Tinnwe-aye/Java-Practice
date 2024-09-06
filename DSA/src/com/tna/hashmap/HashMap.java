package com.tna.hashmap;

import java.util.LinkedList;

public class HashMap<K, V> {
    // Node class to represent each key-value pair in the HashMap
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node<K, V>>[] buckets; // Array of linked lists (buckets)
    private int capacity = 16; // Initial capacity
    private int size = 0;

    @SuppressWarnings("unchecked")
    public HashMap() {
        buckets = new LinkedList[capacity];
    }

    // Hash function to compute index for the given key
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    // Method to add or update a key-value pair
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new LinkedList<>();
        }

        // Check if the key already exists in the bucket
        for (Node<K, V> node : buckets[bucketIndex]) {
            if (node.key.equals(key)) {
                node.value = value; // Update the value if key is found
                return;
            }
        }

        // If key is not found, add a new node to the bucket
        Node<K, V> newNode = new Node<>(key, value);
        buckets[bucketIndex].add(newNode);
        size++;
    }

    // Method to retrieve the value associated with a key
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[bucketIndex];

        if (bucket == null) return null;

        // Search through the linked list for the key
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null; // Key not found
    }

    // Method to remove a key-value pair by key
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[bucketIndex];

        if (bucket == null) return null;

        // Search through the linked list for the key
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                size--;
                return node.value;
            }
        }

        return null; // Key not found
    }

    // Method to check if the HashMap contains a key
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Method to get the current size of the HashMap
    public int size() {
        return size;
    }

    // Method to clear the HashMap
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
                buckets[i].clear();
            }
        }
        size = 0;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for key 'Two': " + map.get("Two")); // Output: 2
        System.out.println("Map contains 'Three': " + map.containsKey("Three")); // Output: true

        map.remove("Two");
        System.out.println("Map contains 'Two' after removal: " + map.containsKey("Two")); // Output: false

        System.out.println("Current size of the map: " + map.size()); // Output: 2
    }
}

