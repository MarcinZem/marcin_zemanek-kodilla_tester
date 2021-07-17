public class Application {
    public double age;
    public int height;

    public static void main(String[] args) {

        public Application( double age, int height){
            double age = 40.5;
            int height = 178;

            this.age = age;
            this.height = height;

            Application application = new Application(40.5, 178);
            System.out.println(application.height);
            System.out.println(application.age);

            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}


