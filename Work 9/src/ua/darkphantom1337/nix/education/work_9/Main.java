package ua.darkphantom1337.nix.education.work_9;

import java.util.Scanner;

public class Main {

    /**
     * @Author DarkPhantom1337
     * @Description Assignment from the NIX Education platform # 9
     * @AuthorURL https://vk.com/darkphantom1337
     */

    public static void main(String[] args) {
        System.out.println("Practical task №9 | Developer: DarkPhantom1337.\n");
        int n0 = 1, n1 = 1, n2 = 0, limit = 3;
        Boolean is_norm = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("-> Введите число до которого нужно вывести числа фибоначчи.");
        limit = sc.nextInt();
        System.out.print(0 + " " + n0 + " " + n1 + " ");
        while (is_norm) {
            n2 = n0 + n1;
            if (n2 > limit) {
                is_norm = false;
                return;
            }
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}

