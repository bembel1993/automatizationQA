package main;

public class TriangleMethods {
    private int a;
    private int b;
    private int c;

    public TriangleMethods(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleMethods() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "TriangleMethods{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }



    public boolean equalateralOrIsosceles(int a, int b, int c) {
        if (a == b && a == c && b == c) {
            System.out.println("Triangle is equilateral (равносторонний)");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triangle isosceles (равнобедренный)");
        }
        return true;
    }

    public boolean versatile(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            System.out.println("Methode versatile not use");
        } else {
            System.out.println("Triangle versatile (разносторонний)");
        }
        return true;
    }

    public boolean notExist(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Methode notExist not use");
        } else {
            System.out.println("Triangle does not exist");
        }
        return true;
    }
}
