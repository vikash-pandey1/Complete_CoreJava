package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);  
        // print arraylist
        System.out.println(a);     
         // get element from particular index
        int element = a.get(3);  
        System.out.println(element);
        // add element at particular index
        a.add(1, 6);    
        System.out.println(a);
        // set element at particular index
        a.set(0, 9);  
        System.out.println(a);
        // delete element at particular index
        a.remove(1);
        System.out.println(a);
        // seze of array
        System.out.println("size of array");
        int size = a.size();
        System.out.println(size);
        // loops in array
        System.out.println("loop in array");
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        System.out.println();
        //sorting 
        System.out.println( " short an array");
        Collections.sort(a);
        System.out.println(a);
        //ArrayList <String> s = new ArrayList<String>();
        // ensure that elemenent is present or not
        System.out.println(a.contains(5));
        //a.clear();
        System.out.println(a.indexOf(2));
        System.out.println(a.lastIndexOf(2));
        System.out.println(a.set(0, 0));
        System.out.println(a.set(1, 1));
        System.out.println(a);
        a.add(2,2);
        System.out.println(a);
        System.out.println(a);

    }
}
