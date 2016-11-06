package haas.zp3jv.s04;

/**
 * Created by AntoninHaas.
 */
public class NumericList<T extends Number> {
    private T value;
    private NumericList<T> next;

    public NumericList(T number) {
        this.value = number;
        this.next = null;
    }

    public T first() {
        return value;
    }

    public NumericList<T> next() {
        return next;
    }

    public void add(T number) {
        NumericList<T> newList = new NumericList<>(number);

        if (next == null) {
            next = newList;
        } else {
            NumericList<T> last = next;

            while (last.next() != null) {
                last = last.next();
            }

            last.next = newList;
        }
    }

    public int size() {
        int count = 1;

        NumericList<T> list = next;

        while (list != null) {
            count++;
            list = list.next();
        }

        return count;
    }

    public double sum() {
        double sum = value.doubleValue();

        NumericList<T> list = next;

        while (list != null) {
            sum += list.first().doubleValue();
            list = list.next;
        }

        return sum;
    }
}
