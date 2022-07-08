package com.company;

public class Class {
    private int num;
    private String string;
    private int[] ints;

    public Class(int num, String string, int[] ints){
        this.num = num;
        this.string = string;
        this.ints = ints;

        for (int a : ints){
            System.out.println(a);
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }
}
