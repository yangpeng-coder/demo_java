package h_you.demo;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight, high;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your high:");
        try {
            high = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid high!");
            return;
        }

        System.out.print("Your weight:");
        try {
            weight = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid weight!");
            return;
        }

        double bmi = weight / (high * high);
        if (bmi < 18.5) {
            System.out.println("过轻");
        } else if ((bmi > 18.5 || bmi - 18.5 < 0.00001) && bmi < 25) {
            System.out.println("正常");
        } else if ((bmi > 25 || bmi - 25 < 0.00001) && bmi < 28) {
            System.out.println("过重");
        } else if ((bmi > 28 || bmi - 28 < 0.00001) && bmi < 32) {
            System.out.println("肥胖");
        } else if (bmi > 32 || bmi - 32 < 0.00001) {
            System.out.println("过于肥胖");
        }

        String fruit = "mango";
        int opt = switch(fruit) {
            case "orange" -> 1;
            case "apple", "pear" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code;
            }
        };
        System.out.println(opt);
    }
}