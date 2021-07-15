public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("laptop jest lekki");
        } else if (this.weight >= 1000 && this.weight < 2000) {
            System.out.println("laptop jest niezbyt ciężki");
        } else {
            System.out.println("laptop jest bardzo ciężki");
        }
    }
    public void checkYearAndPrice() {
        if (this.year < 2018 && this.price < 600) {
            System.out.println("laptop jest stary i tani");
        } else if (this.year >= 2019 && this.year <= 2020 && this.price <= 1000) {
            System.out.println("laptop jest stosunkowo nowy i przystępny cenowo");
        } else {
            System.out.println("laptop jest nowy i drogi");
        }

    }

}