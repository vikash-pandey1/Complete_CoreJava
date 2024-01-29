//package com.Functional;
@FunctionalInterface
interface Hello{
    public void add(int i , int y);
}
public class lemda {
    public static void main(String[] args) {
        


        Hello h = (i,y) -> { 
            int z = i+y;
            System.out.println(" hello lamda"+z);
        };
        h.add(18,38);
    }
}
