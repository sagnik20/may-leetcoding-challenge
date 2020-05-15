class Trie {
    
    class TrieNode{
        static final int ALPHABET_SIZE=26;
        TrieNode[] child = new TrieNode[ALPHABET_SIZE];
        boolean isEnd;
    }
    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] data = word.toCharArray();
        TrieNode tempNode = root;
        for(char c : data){
            int index = c - 'a';
            if(tempNode.child[index] == null)
                tempNode.child[index] = new TrieNode();
            tempNode = tempNode.child[index];
        }
        tempNode.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] data = word.toCharArray();
        TrieNode tempNode = root;

        for (char c : data) {
            int index = c - 'a';
            if (tempNode.child[index] == null) {
                return false;
            }
            tempNode = tempNode.child[index];
        }
        if (tempNode != null && tempNode.isEnd == false) {
            return false;
        }
        return true;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] data = prefix.toCharArray();
        TrieNode tempNode = root;

        for (char c : data) {
            int index = c - 'a';
            if (tempNode.child[index] == null) {
                return false;
            }
            tempNode = tempNode.child[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
