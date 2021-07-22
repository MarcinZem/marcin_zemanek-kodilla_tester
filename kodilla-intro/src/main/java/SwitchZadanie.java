public class SwitchZadanie {

    public String Choose() {
        String userSelected = UserDialogs.getUserSelection();
        String color = "Blue, Cyan, Yellow, Magenta, White";
        String result = null;
        switch (userSelected) {
            case "B":
                result = "Blue";
                break;
            case "C":
                result = "Cyan";
                break;
            case "Y":
                result = "Yellow";
                break;
            case "M":
                result = "Magenta";
                break;
            case "W":
                result = "White";
                break;

        }
        return result;
    }
}