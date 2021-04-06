package org.kotopka;

import org.w3c.dom.Node;

/**
 * {@code StringST} - Trie-based symbol table with {@code String} keys. Adapted from <a href="https://algs4.cs.princeton.edu/home/">Altorithms 4th ed</a> by Robert
 * Sedgewick and Kevin Wayne.
 * @param <Value> Generic value associated with the {@code String} key
 */

public class StringST<Value> {

    private static class Node {
        private Object val;
        private Node[] next = new Node[R];
    }

    private final static int R = 256;   // radix for extended ASCII
    private Node root = new Node();
    private int size;

    public StringST() {

    }

    public void put(String key, Value val) {
        root = put(root, key, val, 0);
        size++;
    }

    private Node put(Node x, String key, Value val, int d) {
        if (x == null) x = new Node();
        if (d == key.length()) {
            x.val = val;
            return x;
        }
        char c = key.charAt(d);
        x.next[c] = put(x, key, val, d + 1);
        return x;
    }

    public Value get(String key) {
        Node x = get(root, key, 0);
        if (x == null) return null;
        return (Value) x.val;
    }

    private Node get(Node x, String key, int d) {
        if (x == null) return null;
        if (d == key.length()) return x;
        char c = key.charAt(d);
        return get(x.next[c], key, d + 1);
    }

    public void delete(String key) {

    }

    public boolean contains(String key) {
        return get(key) != null;
    }

    public boolean isEmpty() { return size == 0; }

    public String longestPrefixOf(String s) {

    }

    public Iterable<String> keysWithPrefix(String s) {

    }

    public Iterable<String> keysThatMatch(String s) {

    }

    public int size() { return size; }

    public Iterable<String> keys() {

    }

}
