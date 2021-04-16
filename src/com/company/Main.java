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
        
        //Этот код печатается 8 16 6. main()Метод вызывает конструктор с одним параметром.
        //Этот конструктор добавляет второе жестко закодированное значение и вызывает конструктор с двумя параметрами.
        //Этот конструктор добавляет еще одно жестко закодированное значение и вызывает конструктор с тремя параметрами.
         //   Трехпараметрический конструктор назначает переменные экземпляра.
    }}








