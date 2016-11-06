package haas.zp3jv.s04;

/**
 * Created by AntoninHaas.
 */
public class Main {

    public static void main(String[] args) {
        //task1
        NumericList<Integer> numList = new NumericList<>(100);

        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);
        numList.add(50);
        numList.add(60);

        System.out.println("First in the list: " + numList.first());
        System.out.print("Rest: ");
        NumericList<Integer> rest = numList.next();
        while (rest != null) {
            System.out.print(rest.first() + " ");
            rest = rest.next();
        }
        System.out.println();
        System.out.println("Length: " + numList.size());
        System.out.println("Sum: " + numList.sum());
        System.out.println();

        //task2
        System.out.println(formatStr("Lorem %0 dolor %1 amet. %2", "ipsum", "sit", 11));
        System.out.println(formatStr("Lorem %1 dolor %2 amet. %0", "ipsum", "sit", 11));
        System.out.println();

        //task3
        AnimalFarm farm = new AnimalFarm();

        farm.add("Alik", Species.PES, Gender.MALE);
        farm.add("Bobik", Species.KACHNA, Gender.FEMALE);
        farm.add("Chubaka", Species.PES, Gender.FEMALE);
        farm.add("Donald", Species.KACHNA, Gender.MALE);

        farm.list();

    }

    private static String formatStr(String format, Object... args) {
        StringBuilder output = new StringBuilder();
        int pointer = 0;

        for (int i = 0; i < format.length(); i++) {
            if (format.charAt(i) == '%') {
                int end = i + 1;
                while (end < format.length() && format.charAt(end) >= '0' && format.charAt(end) <= '9') end++;
                output.append(format.substring(pointer, i));
                output.append(args[Integer.parseInt(format.substring(i + 1, end))].toString());
                pointer = end;
            }
        }

        return output.toString();
    }
}
