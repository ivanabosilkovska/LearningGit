package com.company;

public class NewClass {

    public static void main(String[] args) {

        System.out.println("Learning Git workflow!");

    }

    // ova e komentar
    private int a = 5;
/*
    public int getA() {
        return a;
    }*/

    public void setA(int a) {
        this.a = a;
    }

    private static void eat(){
        System.out.println("Eating...");
    }

    public NewClass(int a) {
        this.a = a;
    }
}
