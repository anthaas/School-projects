package haas.zp3jv.s05;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AntoninHaas.
 */
public class Scheme {
    public static List<Object> map(List<Object> list, Mapping m) {
        List<Object> l = new ArrayList<>();

        for (Object o : list) {
            l.add(m.map(o));
        }

        return l;
    }

    public static List<Object> filter(List<Object> list, Condition c) {
        List<Object> l = new ArrayList<>();

        for (Object o : list) {
            if (c.condition(o))
                l.add(o);
        }

        return l;
    }
}
