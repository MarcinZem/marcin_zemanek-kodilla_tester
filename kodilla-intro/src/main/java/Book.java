public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
    }

    public static void main(String[] args) {
        System.out.println("Henryk Sienkiewicz, W pustyni i w puszczy");
    }

    private static Book of(String author, String title) {


        Book book = Book.of("Henryk Sienkiewicz", "W pustyni i w puszczy");

        return book;

    }
}




