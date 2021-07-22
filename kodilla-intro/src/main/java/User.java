public class User {

    String name;
    double age;
    double height;

    public User(String name, double age, double height) {

        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean validateName() {
        if (name != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateAge() {
        if (age > 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateHeight() {
        if (height > 160) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        User user = new User("Adam", 40.5, 178);
        if (user.validateName()) {
            if (user.validateAge() && user.validateHeight()) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}




