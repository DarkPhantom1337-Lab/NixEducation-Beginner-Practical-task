package ua.darkphantom1337.nix.education.work_7;

import java.util.Scanner;

public class Main {

    /**
     * @Author DarkPhantom1337
     * @Description Assignment from the NIX Education platform # 7
     * @AuthorURL https://vk.com/darkphantom1337
     */

    public static void main(String[] args) {
        System.out.println("Practical task №7 | Developer: DarkPhantom1337.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("-> Введите число, цифры которого нужно сложить.");
        Integer num = scanner.nextInt(), sum = 0;
        for (char c : num.toString().toCharArray())
            sum += Character.getNumericValue(c);
        System.out.println("-> Сумма цифр числа " + num + " = " + sum);
    }
}
