package ua.darkphantom1337.nix.education.work_5;

public class Main {

    /**
     * @Author DarkPhantom1337
     * @Description Assignment from the NIX Education platform # 5
     * @AuthorURL https://vk.com/darkphantom1337
     */

    public static void main(String[] args) {
        System.out.println("Practical task №5 | Developer: DarkPhantom1337.\n");
        Integer[] int_mas = new Integer[]{1, 2, 3, 4, 7, 15};
        String smas = "";
        for (Integer i : int_mas)
            smas += "," + i;
        System.out.print("Созданный масив " + smas.substring(1));
    }
}
