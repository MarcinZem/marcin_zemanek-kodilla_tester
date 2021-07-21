public class Book {

        private String author;
        private String title;


        public Book(String author,String title){
            this.author = "Henryk Sienkiewicz";
            this.title = "W pustyni i w puszczy";
        }

        public void main(String[]args){
            System.out.println(this.author, this.title);
        }

        private static Book of(String author,String title){


            Book book=Book.of(this.author,this.title);

            return book;

        }
    }
}
