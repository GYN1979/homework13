package homework13;

public class Main {
    public static void main(String[] args) {
        System.out.println("level easy");
        Author author = new Author( "Andrey", "Belyanin");
        Author author1 = new Author("Sergey", "Lukyanenko");
        Book book = new Book("The sword without a name", author, 1997);
        Book book1 = new Book(" Aagarh", author, 2007);
        Book book2 = new Book("Changed", author1, 2002);
        Book book3 = new Book(" Patrols", author1, 1998);
        System.out.println( " Название " + book.getBookname()+ " Автор " + book.getAuthor () + " Год издания " + book.getPublicationYear());
        book.setPublicationYear(2000);
        System.out.println(book.getPublicationYear());
        System.out.println( " Название " + book1.getBookname()+ " Автор " + book1.getAuthor () + " Год издания " + book1.getPublicationYear());
        book1.setPublicationYear(2010);
        System.out.println(book1.getPublicationYear());
        System.out.println( " Название " + book2.getBookname()+ " Автор " + book2.getAuthor () + " Год издания " + book2.getPublicationYear());
        book2.setPublicationYear(2005);
        System.out.println(book2.getPublicationYear());
        System.out.println( " Название " + book3.getBookname()+ " Автор " + book3.getAuthor () + " Год издания " + book3.getPublicationYear());
        book3.setPublicationYear(2002);
        System.out.println(book3.getPublicationYear());
            }

}

