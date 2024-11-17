package h_you.demo;

import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.printf("%s\n", num);
        System.out.printf("%08x\n", num);

        var scanner = new Scanner(System.in);
        System.out.print("Input your last score:");
        double lastScore = scanner.nextInt();
        System.out.print("Input your this score:");
        double score = scanner.nextInt();
        scanner.close();
        if (score >= lastScore) {
            System.out.printf("your score is up. %.2f%%.\n", (score - lastScore) / lastScore * 100);
        } else {
            System.out.printf("your score is down. %.2f%%20.\n", (lastScore - score) / lastScore * 100);
        }

        System.out.println("hello, it's: ");
        System.out.println(new Date());

        int n = 100;
        int sum = (1 + n) * n / 2;
        System.out.println(sum);

        String[] names = {"abc", "xyz", "zoo"};
        for (int i = names.length; i > 0; i--) {
            System.out.println(names[i - 1]);
        }
        System.out.println(Arrays.toString(names));
    }
}
