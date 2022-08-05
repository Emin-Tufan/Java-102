import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        List<Books> book = new ArrayList<>();
        book.add(new Books("Yabanci", 456, "Albert Camus", "14/05/2001"));
        book.add(new Books("Monte Kristo Kontu", 734, "Alexandre Dumas", "22/07/1988"));
        book.add(new Books("Fareler Ve Insanlar", 456, "John Steinbeck", "22/05/1972"));
        book.add(new Books("Incı", 55, "John Steinbeck", "23/06/1969"));
        book.add(new Books("Zaman Makinesi", 453, "H.G. Wells", "01/12/2001"));
        book.add(new Books("Anna Karenina", 457, "Lev Tolstoy", "12/11/2005"));
        book.add(new Books("Insan Ne Ile Yasar", 753, "Lev Tolstoy", "16/04/2007"));
        book.add(new Books("Drakula", 76, "Bram Stoker", "16/03/2008"));
        book.add(new Books("Buyuk Umutlar", 759, " Charles Dickens", "14/05/2009"));
        book.add(new Books("Dava", 88, "Franz Kafka", "15/11/2011"));

        Map<String, String> authorBook = new TreeMap<>();
        book.forEach(i -> authorBook.put(i.getBookName(), i.getAuthorName()));

        List<Books> newBookList = new ArrayList<>();
        book.stream().filter(i -> i.getPageNumber() > 100).forEach(i -> newBookList.add(i));
        newBookList.forEach(i-> System.out.println("Kitabin Adi : "+i.getBookName()+", Kitabin Yazari : "+i.getAuthorName()+", Kitabin Sayfa Sayisi : "+i.getPageNumber()+", Kitabin Yayim Yili : "+i.getReleaseDate()));



    }
}
