package collection;

import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(32);
        ad.add(38);
        ad.add(39);
        ad.add(33);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());

    }
}
