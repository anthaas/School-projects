package haas.zp3jv.s06;

import java.util.*;

/**
 * Created by AntoninHaas.
 */
public class Main {
    public static void main(String[] args) {
        //task1
        Set<Point> points = new HashSet<>();
        points.add(new Point(0, 0));
        points.add(new Point(0, 0));
        points.add(new Point(0, 7));
        points.add(new Point(0, 7));
        points.add(new Point(42, 42));
        points.add(new Point(105, 18));
        points.add(new Point(42, 42));

        System.out.print("Points in set: ");
        for (Point p : points) {
            System.out.print("[" + p.getX() + "," + p.getY() + "] ");
        }
        System.out.println();
        System.out.println();

        //task2
        String input = "asdf asdf asdf, qwop 54 17 blah foo. Bar? bar, bar!";
        Map<String, Integer> frequency = freq(input);
        Iterator it = frequency.entrySet().iterator();
        System.out.println("Frequency counter for: " + input);
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
            it.remove();
        }
        System.out.println();

        //task3
        frequency = freqIgnoreCase(input);
        it = frequency.entrySet().iterator();
        System.out.println("Frequency IgnoreCase counter for: " + input);
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
            it.remove();
        }
        System.out.println();

        //task4
        String expression = "0 0 /";
        Double result = RPNCalc.rpnCalc(expression);
        System.out.println(expression + " = " + result);

        //task5
        Map<String,Integer> variables = new HashMap<>();
        variables.put("foo", 1);
        variables.put("whereIsMyNumber", 37);
        variables.put("theAnswerToLifeUniverseAndEverything", 42);
        expression = "1 foo + theAnswerToLifeUniverseAndEverything * 5 + whereIsMyNumber -";
        result = RPNCalc.rpnCalc(expression, variables);
        System.out.println(expression + " = " + result);

    }

    private static Map<String, Integer> freq(String s) {
        Map<String, Integer> map = new HashMap<>();

        StringBuilder word = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c == '.') || (c == ',') || (c == ' ') || (c == '?') || (c == '!') || ((c >= '0') && (c <= '9'))) {
                String str = word.toString();
                if (!str.equals("")) {
                    Integer freq = map.get(str);
                    map.put(str, (freq == null)? 1 : freq + 1);
                    word = new StringBuilder();
                }
            } else
                word.append(c);
        }

        return map;
    }

    private static Map<String, Integer> freqIgnoreCase(String s) {
        return freq(s.toLowerCase());
    }
}
