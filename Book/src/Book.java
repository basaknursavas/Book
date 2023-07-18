public class Book implements Comparable <Book> {
    private String name ;
    private int numberOfPages ;
    private String authorName ;
    private String dateOfPublic ;

    @Override
    public int compareTo(Book book) {
        return this.getName().compareTo(book.getName());
    }
    @Override
    public String toString() {
        return"Name : " + name + "\t" +
                "Page : " + numberOfPages + "\t" +
                "Author : " + authorName + "\t" +
                "Date : " + dateOfPublic +"\n"  ;
    }


    public Book(String name, int numberOfPages, String authorName, String dateOfPublic) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.dateOfPublic = dateOfPublic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDateOfPublic() {
        return dateOfPublic;
    }

    public void setDateOfPublic(String dateOfPublic) {
        this.dateOfPublic = dateOfPublic;
    }
}
