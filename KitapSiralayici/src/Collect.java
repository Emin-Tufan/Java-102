import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Collect {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();

        //5 adet Book sınıfdan neste üretildi
        Book book1 = new Book("Vadideki Zambak ", 302, "Honore de Balzac", 2014);
        Book book2 = new Book("Karamazov Kardeşler ", 350, "Fyodor Dostoyevski", 1984);
        Book book3 = new Book("Gazap Uzumleri  ", 105, " John Steinbeck", 2005);
        Book book4 = new Book("Taht Oyunlari", 850, "George Martin", 2001);
        Book book5 = new Book("Savas ve Baris ", 120, "Lev Nikoloyeviç Tolstoy", 1975);

        //Nesneler  books nesnesine atandı
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        // Itarator oluşturuldu
        Iterator<Book> itr = books.iterator();

        //Itaretor ile nesnedeki verilerin kitap adina ulaşıldı
        while (itr.hasNext()) {
            System.out.println("Kitabin adi : " + itr.next().getBookName());
        }
        //Anonim method ile nesneye ait bir Comprator oluşturuldu
        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPage() - o1.getPage();
            }
        });
        //books verisindeki bütün veriler books2 versine atandi
        books2.addAll(books);
        //Itaretor oluşturuldu
        Iterator<Book> bookIterator = books2.iterator();
        //Itaretor ile kitap adi donuldu

        while (bookIterator.hasNext()) {
            System.out.println("Kitabin adi : " + bookIterator.next().getBookName());
        }


    }
}
