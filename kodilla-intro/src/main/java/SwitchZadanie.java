public class SwitchZadanie {
    public String Choose() {
        String userSelected = UserDialogs.getUserSelection();
        String a = UserDialogs.getUserSelection();
        String color = "Blue, Cyan, Yellow, Magenta, White";
        String result = color;
        switch (userSelected) {
            case "Blue":
                result = a;
                break;
            case "Cyan":
                result = a;
                break;
            case "Yellow":
                result = a;
                break;
            case "Magenta":
                result = a;
                break;
            case "White":
                result = a;
                break;

        }
        return result;
    }
}