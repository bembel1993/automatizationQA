import java.io.IOException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        int c = 4;

        TriangleMethods triangle = new TriangleMethods();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("1 side: ");//0-10
        int sA = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("2 side: ");//0-10
        int sB = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("3 side: ");//0-10
        int sC = sc3.nextInt();

        if (sA == a && sB == b && sC == c) {
            if (triangle.notExist(a, b, c)) {
                if (triangle.versatile(a, b, c)) {
                    if (triangle.equalateralOrIsosceles(a, b, c)) {
                    }
                }
            }
        } else {
            System.out.println("No input side");
        }
        ///////////////////////////////////////////////////////////////////////////
        System.out.println(" ");
        System.out.println("Verification");

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b || a == c || b == c) {
                if (a == b && a == c && b == c) {
                    System.out.println("Triangle is equilateral (равносоторнний)");
                } else {
                    System.out.println("Triangle isosceles (равнобедренный)");
                }
            } else {
                System.out.println("Triangle versatile (разносторонний)");
            }
        } else {
            System.out.println("Triangle does not exist (не существует)");
        }
    }
}
