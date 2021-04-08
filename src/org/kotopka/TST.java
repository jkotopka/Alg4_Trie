package org.kotopka;

/**
 * {@code TST} - Ternary-Search-Trie: Trie-based symbol table with {@code String} keys. Adapted from <a href="https://algs4.cs.princeton.edu/home/">Altorithms 4th ed</a> by Robert
 * Sedgewick and Kevin Wayne.
 * @param <Value> Generic value associated with the {@code String} key
 */

public class TST<Value> {

    private class Node {
        char c;
        Value val;
        Node left, mid, right;
    }

    private Node root;

    public void put(String key, Value val) {

    }

    public Value get(String key) {

    }
}
