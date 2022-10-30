package homework13;
public class Book {
    private final String bookname;
    private final Author author;
    private int publicationYear;
    public Book(String bookname, Author author, int publicationYear ) {
        this.bookname = bookname;
        this.author =  author;
        this.publicationYear = publicationYear;
        }
    public String getBookname () {
        return bookname;
    }
    public Author getAuthor (){
        return author;
    }
    public int getPublicationYear (){
        return publicationYear;
    }
    public void setPublicationYear (int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
