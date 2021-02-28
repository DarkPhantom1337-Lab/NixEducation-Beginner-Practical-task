package ua.darkphantom1337.nix.education.work_3;

import java.util.Scanner;

public class Main {

    /**
     * @Author DarkPhantom1337
     * @Description Assignment from the NIX Education platform # 3
     * @AuthorURL https://vk.com/darkphantom1337
     */

    public static void main(String[] args) {
        System.out.println("Practical task №3 | Developer: DarkPhantom1337.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("-> Введите своё имя и фамилию через пробел.");
        String fio = scanner.nextLine();
        if (fio.contains(" "))
            for (String s : fio.split(" "))
                System.out.println(s);
        else System.out.println("В строке нету пробелов :-( Повторите попытку ещё раз. (Перезапуск программы)");
    }
}
