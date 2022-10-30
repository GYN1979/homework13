package homework13;

public class Author {
    private final String name;
    public final String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String toString() {
        return " Автор " + name + " " + surname;
        }
}
