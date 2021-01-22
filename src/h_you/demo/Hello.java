package h_you.demo;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length);
        System.out.print('a');
        System.out.print('b');
        System.out.println('c');
        int num = 123456789;
        System.out.printf("%s\n", num);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your last score:");
        double lastScore = scanner.nextInt();
        System.out.print("Input your this score:");
        double score = scanner.nextInt();
        scanner.close();
        if (score >= lastScore) {
            System.out.printf("your score is up. %.2f.\n", (score - lastScore) / lastScore);
        } else {
            System.out.printf("your score is down. %.2f.\n", (lastScore - score) / lastScore);
        }
    }
}
