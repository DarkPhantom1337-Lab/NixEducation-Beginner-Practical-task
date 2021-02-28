package ua.darkphantom1337.nix.education.work_8;

public class Main {

    /**
     * @Author DarkPhantom1337
     * @Description Assignment from the NIX Education platform # 8
     * @AuthorURL https://vk.com/darkphantom1337
     */

    public static void main(String[] args) {
        System.out.println("Practical task №8 | Developer: DarkPhantom1337.\n");
        for (int c = 1; c<=10; c++)
            for (int r = 1; r <= 10;r++)
                System.out.print("" + r +  " * " + c + " = "  + r*c + (r != 10 ? " | " : "\n"));
    }
}
