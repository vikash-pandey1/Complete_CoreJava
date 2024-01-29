package collection;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        l.add(0,6);
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        l.set(0, 0);
        System.out.println(l);


    }
}
