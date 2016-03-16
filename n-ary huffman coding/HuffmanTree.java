import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * A tree for decoding Huffman codes.
 */
public class HuffmanTree {
    private Node root;

    /**
     * Constructs a Huffman tree from given character frequencies.
     *
     * @param frequencies a map whose keys are the characters to be encoded
     *                    and whose values are the frequencies of the characters
     */
    public HuffmanTree(Map<Character, Integer> frequencies, Integer childNodes) {
        PriorityQueue<Node> nodes = new PriorityQueue<>();
        for (char ch : frequencies.keySet()) {
            Node newNode = new Node();
            newNode.character = ch;
            newNode.frequency = frequencies.get(ch);
            nodes.add(newNode);
        }

        while (nodes.size() > 1) {
            Node newNode = new Node();
            newNode.child = new Node[childNodes];
            int smallestFrequencySum = 0;

            for (int i = 0; i < childNodes; i++) {
                Node smallest;
                if (!nodes.isEmpty()) {
                    smallest = nodes.remove();

                } else {
                    smallest = null;
                }
                newNode.child[i] = smallest;
                if (smallest != null) {
                    smallestFrequencySum += smallest.frequency;
                }
            }
            newNode.frequency = smallestFrequencySum;
            newNode.childrenNumber = childNodes;
            nodes.add(newNode);
        }

        root = nodes.remove();
    }

    /**
     * Decodes an encoded string.
     *
     * @param input a string contains 0,1 to n
     */
    public String decode(String input) {
        String result = "";
        Node n = root;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            n = n.child[Integer.parseInt(String.valueOf(ch))];
            if (n.child == null) //n is a leaf
            {
                result = result + n.character;
                n = root;
            }
        }
        return result;
    }

    public Map<Character, String> getEncodingMap() {
        Map<Character, String> map = new HashMap<>();
        if (root != null) {
            root.fillEncodingMap(map, "");
        }
        return map;
    }

    class Node implements Comparable<Node> {
        public char character;
        public int frequency;
        public int childrenNumber;
        public Node[] child;


        public int compareTo(Node other) {
            return frequency - other.frequency;
        }

        public void fillEncodingMap(Map<Character, String> map, String prefix) {
            if (child == null) // it's a leaf
            {
                map.put(character, prefix);
            } else {
                for (int i = 0; i < childrenNumber; i++) {
                    if (child[i] != null) {
                        child[i].fillEncodingMap(map, prefix + Integer.toString(i));
                    }
                }
            }
        }
    }
}
