import java.util.TreeSet;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984",352,"George Orwell","2000");
        Book b2 = new Book("Sense and Sensibility",392,"Jane Austen","1811");
        Book b3 = new Book("Schachnovelle",96,"Stefan Zweig","2012");
        Book b4 = new Book("Siddharta",148,"Hermann Hesse","2002");
        Book b5 = new Book(" L' Etranger",112, "Albert Camus","1942");

        TreeSet<Book> booksSortedByName = new TreeSet<>();
        booksSortedByName.add(b1);
        booksSortedByName.add(b2);
        booksSortedByName.add(b3);
        booksSortedByName.add(b4);
        booksSortedByName.add(b5);

        System.out.println("Books sorted by name");
        System.out.print(booksSortedByName);

        TreeSet<Book> booksSortedByPage = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book b1, Book b2) {
                return b1.getNumberOfPages() - b2.getNumberOfPages();
            }
        });

        booksSortedByPage.add(b1);
        booksSortedByPage.add(b2);
        booksSortedByPage.add(b3);
        booksSortedByPage.add(b4);
        booksSortedByPage.add(b5);

        System.out.println("Books sorted by page");
        System.out.println(booksSortedByPage);
    }
}
