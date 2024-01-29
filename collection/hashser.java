package collection;

import java.util.HashSet;

public class hashser {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(6,0.5f);
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        System.out.println(h);
    }
}
