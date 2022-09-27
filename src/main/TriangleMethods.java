public class TriangleMethods {

    public TriangleMethods() {
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
