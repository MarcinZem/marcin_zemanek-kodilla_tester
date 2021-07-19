public class Book {

    private String author = "Henryk Sienkiewicz";
    private String title = "W pustyni i w puszczy";


    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void main(String[] args) {
        System.out.println(this.author, this.title);
    }

    private static Book of(String author, String title) {


        Book book = Book.of(this.author, this.title);

        return book;

    }
}




