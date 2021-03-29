public class main {
    static Trie.TrieNode root;
    public static void main(String args[]) {
        String keys[] = {"bank", "book", "bar", "bring", "film", "filter", "simple", "silt", "silver"};
        String output[] = {"Not present in trie", "Present in trie"};

        root = new Trie.TrieNode();

        //Inserting elements
        int i;
        for (i = 0; i < keys.length ; i++)
            Trie.insert(keys[i]);

        //Searching elements and output
        if(Trie.search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(Trie.search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(Trie.search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(Trie.search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);
    }
}
