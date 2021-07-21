public class SwitchZadanie {

    public String Choose() {
        String userSelected = UserDialogs.getUserSelection();
        String color = "Blue, Cyan, Yellow, Magenta, White";
        String result = null;
        switch (userSelected) {
            case "Blue":
                result = "B";
                break;
            case "Cyan":
                result = "C";
                break;
            case "Yellow":
                result = "Y";
                break;
            case "Magenta":
                result = "M";
                break;
            case "White":
                result = "W";
                break;

        }
        return result;
    }
}