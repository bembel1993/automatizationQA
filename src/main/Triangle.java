import java.io.IOException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        int c = 4;

        TriangleMethods triangle = new TriangleMethods();

        Scanner sc1 = new Scanner(System.in);
        int sA = 0;
        int sB = 0;
        int sC = 0;
        System.out.println("1 side: ");//0-10
        try {
            sA = sc1.nextInt();
        } catch (Exception exception) {
            System.out.println("Char not pass !");
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("2 side: ");//0-10
        try {
            sB = sc2.nextInt();
        } catch (Exception exception) {
            System.out.println("Char not pass !");
        }
        Scanner sc3 = new Scanner(System.in);
        System.out.println("3 side: ");//0-10
        try {
            sC = sc3.nextInt();
        } catch (Exception exception) {
            //exception.printStackTrace();
            System.out.println("Char not pass !");
        }
        if (sA == a && sB == b && sC == c) {
            if (triangle.notExist(a, b, c)) {
                if (triangle.versatile(a, b, c)) {
                    if (triangle.equalateralOrIsosceles(a, b, c)) {
                    }
                }
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
        } else {
            System.out.println("Not input side !");
        }
    }
}
