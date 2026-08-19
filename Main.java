import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            double b = sc.nextDouble();
            String s = sc.next();
            System.out.println("a = " + a + ", b = " + b + ", s = " + s);
        }
        for (int i = 0; i < 5; i++) {}
    }
}