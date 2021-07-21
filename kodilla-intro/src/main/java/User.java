public class User {

        String name;
        double age;
        double height;

        public User(String name,double age,double height){

            this.name=name;
            this.age=age;
            this.height=height;
        }

        void Validate{

            boolean nameIsntNull;
        if (name != null) {
            System.out.println("He or she has name");
        }
        else {
            System.out.println("He or she is nameless");}

        boolean heIsOlderThan30AndHigherThan160Cm;
        if (age > 30 && height > 160) {
            System.out.println("He or she is older than 30 and higher than 160cm");
        }
        else {
            System.out.println("He or she is 30 (or younger) or 160cm (or shorter)");}

        }
    }

