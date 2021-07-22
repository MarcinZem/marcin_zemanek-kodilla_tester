import java.util.Scanner;

public class UserDialogs {

    static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select color (B-Blue, C-Cyan, Y-Yellow, M-Magenta, W-White):");
        return scanner.nextLine();

    }
}



