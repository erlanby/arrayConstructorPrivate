package com.company;


public class Main {
    public static void main(String[] args) {
        Class classes = new Class(25, "Peaksoft", new int[]{12, 66, 96} );

        System.out.println(classes.getString());
        System.out.println(classes.getNum());
        System.out.println(classes.getInts());



    }
}