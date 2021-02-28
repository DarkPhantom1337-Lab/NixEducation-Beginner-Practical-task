package ua.darkphantom1337.nix.education.work_4;

import java.util.Scanner;

public class Main {

    /**
     * @Author DarkPhantom1337
     * @Description Assignment from the NIX Education platform # 4
     * @AuthorURL https://vk.com/darkphantom1337
     */

    public static void main(String[] args) {
        System.out.println("Practical task №4 | Developer: DarkPhantom1337.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("-> Введите два числа и название операции которую над ними нужно произвести."
        + "\nsum - сумма чисел"
        + "\ndiff - разница чисел"
        + "\nmult - умножение чисел"
        + "\nsplit - деление чисел");
        String[] all_data = scanner.nextLine().split(" ");
        if (all_data.length == 3){
            try {
                Integer one = Integer.parseInt(all_data[0]), two = Integer.parseInt(all_data[1]);
                if (all_data[2].equals("sum")) {
                    System.out.println("Операция: Суммирование чисел Результат: " + one + " + " + two + " = " + (one + two));
                    return;
                }
                if (all_data[2].equals("diff")) {
                    System.out.println("Операция: Разница чисел Результат: " + one + " - " + two + " = " + (one - two));
                    return;
                }
                if (all_data[2].equals("mult")) {
                    System.out.println("Операция: Умножение чисел Результат: " + one + " * " + two + " = " + (one * two));
                    return;
                }
                if (all_data[2].equals("split")) {
                    System.out.println("Операция: Деление чисел Результат: " + one + " / " + two + " = " + (one / two));
                    return;
                }
                System.out.println("Операции " + all_data[2] + " не найдено! Повторите попытку.");
                return;
            } catch (Exception e){
                System.out.println("Первые два аргумента должны быть числами!");
                return;
            }
        }
        System.out.println("Не хватает аргументов. Пример использования: 5 10 sum");
    }
}
