package com.company;

public class Main {
    private int numTeeth;
    private int numWhiskers;
    private int weight;
    public Main(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }
    public Main(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }
    public Main(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }
    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }
    public static void main(String[] args) {
        Main mouse = new Main(8);
        mouse.print();
    }}








