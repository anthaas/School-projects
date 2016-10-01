import java.util.HashMap;
import java.util.Map;

/**
 * semi-adaptive n-ary huffman coding
 */
public class Main {

    public static void main(String[] args) {


        String input = "Would it save you a lot of time if I just gave up and went mad now?";
        Integer arity = 3; //0 <= arity <= 10

        Map<Character, Integer> frequencyMap = getFrequencyMap(input);
        HuffmanTree tree = new HuffmanTree(frequencyMap, arity);
        Map<Character, String> encodingMap = tree.getEncodingMap();

        String encoded = encode(input, encodingMap);
        String decoded = tree.decode(encoded);
        Double entropy = countEntropy(frequencyMap);
        Double avgCodeLen = countAvgCodeLen(encodingMap);
        Double redundancy = Math.abs(avgCodeLen-entropy);

        System.out.println("Input:\t\t" + input);
        System.out.println("Encoded:\t" + encoded);
        System.out.println("Decoded:\t" + decoded);
        System.out.println();
        System.out.format("Entropy:\t\t%.3f\n", entropy);
        System.out.format("Avg code len:\t%.3f\n", avgCodeLen);
        System.out.format("Redundancy:\t\t%.3f\n", redundancy);
    }

    private static double countAvgCodeLen(Map<Character, String> encodingMap) {
        double avgCodeLen = 0;
        Integer totalCount = 0;

        for (Map.Entry<Character, String> e : encodingMap.entrySet()) {
            avgCodeLen += e.getValue().length();
            totalCount++;
        }

        return avgCodeLen/totalCount;
    }

    private static double countEntropy(Map<Character, Integer> frequencyMap) {
        Integer totalCount = 0;
        String charOccurrences = "";
        Map<Character,Double> probability = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            totalCount += entry.getValue();
            charOccurrences += entry.getKey();
        }

        char[] alphabet = charOccurrences.toCharArray();

        double entropy = 0;
        for (char c : alphabet) {
            double p = (double) frequencyMap.get(c) / totalCount;
            probability.put(c,p);
            entropy += p * Math.log(p) / Math.log(2);
        }

        return Math.abs(entropy);
    }

    private static Map<Character, Integer> getFrequencyMap(String input) {
        Map<Character, Integer> charFreq = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            Integer count = charFreq.get(c);
            int newCount = (count == null ? 1 : count + 1);
            charFreq.put(c, newCount);
        }

        return charFreq;
    }

    private static String encode(String toEncode, Map<Character, String> encodingMap) {
        String result = "";

        for (int i = 0; i < toEncode.length(); i++) {
            char ch = toEncode.charAt(i);
            result = result + encodingMap.get(ch);
        }

        return result;
    }
}
