public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Czy rok 2021 jest przestępny?");

        if (2021 % 4 == 0) {
            System.out.println("rok jest przestępny");
        } else {
            System.out.println("rok nie jest przestępny");
        }
    }
}
