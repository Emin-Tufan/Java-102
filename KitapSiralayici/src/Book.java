public class Book implements Comparable<Book>{
    private final String bookName;
    private  final int page;
    private  final String wirter;
    private  final int publishDate;

    public Book(String bookName, int page, String wirter, int publishDate) {
        this.bookName = bookName;
        this.page = page;
        this.wirter = wirter;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPage() {
        return page;
    }

    public String getWirter() {
        return wirter;
    }

    public int getPublishDate() {
        return publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }
}
