package com.pluralsight;

public class Main {

    private static final String name = "Default Name";
    private int count = 0;

    public static void main(String[] args) {
        helperTest("Hello IntelliJ CE");
    }

    public static void helperTest(String text) {
        System.out.println(text);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}