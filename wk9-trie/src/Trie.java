public class Trie {
    static final int ALPHABET_SIZE = 26;
    static TrieNode root;

    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        boolean isEndOfWord;

        TrieNode(){
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }

    static void insert(String key) {
        int length = key.length();
        int count;

        TrieNode trie = root;

        for (int i = 0; i < length; i++) {
            count = key.charAt(i) - 'a';
            if (trie.children[count] == null)
                trie.children[count] = new TrieNode();

            trie = trie.children[count];
        }
        trie.isEndOfWord = true;
    }

    static boolean search(String key) {
        int length = key.length();
        int count;
        TrieNode trie = root;

        for (int i = 0; i < length; i++) {
            count = key.charAt(i) - 'a';

            if (trie.children[count] == null)
                return false;

            trie = trie.children[count];
        }
        return (trie != null && trie.isEndOfWord);
    }
}
