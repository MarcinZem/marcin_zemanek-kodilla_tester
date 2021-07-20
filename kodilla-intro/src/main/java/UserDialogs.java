import java.util.Scanner;
    public class UserDialogs {

        static String getUserSelection () {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.println("Select color (B-Blue, C-Cyan, Y-Yellow, M-Magenta, W-White):");
                    switch (getUserSelection()) {
                        case "B":
                            return "Blue";
                        case "C":
                            return "Cyan";
                        case "Y":
                            return "Yellow";
                        case "M":
                            return "Magenta";
                        case "W":
                            return "White";
                        default:
                            System.out.println("Please choose other color");
                    }
                }
            }
        }


