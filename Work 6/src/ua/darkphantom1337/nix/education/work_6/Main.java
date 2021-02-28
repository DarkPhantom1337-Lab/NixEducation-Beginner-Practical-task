package ua.darkphantom1337.nix.education.work_6;

import java.util.Scanner;

public class Main {

    /**
     * @Author DarkPhantom1337
     * @Description Assignment from the NIX Education platform # 6
     * @AuthorURL https://vk.com/darkphantom1337
     */


    public static void main(String[] args) {
        System.out.println("Practical task №6 | Developer: DarkPhantom1337.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("-> Введите температуру в Фарингейтах");
        Integer temperature = scanner.nextInt();
        System.out.println("Температура по цельсию: " + ((temperature-32)/1.8));
    }
}
