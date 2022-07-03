import java.util.Comparator;
import java.util.TreeSet;

public class TreeSett {
    public static void main(String[] args) {

        //Kendi yazdığımız methodu implement ederek sıralamasını sağlıyoruz int olarak
        TreeSet<Student> treeSet = new TreeSet<>(new OrderNotComperator());

        treeSet.add(new Student("Buse", 22));
        treeSet.add(new Student("Halil", 32));
        treeSet.add(new Student("Meryem", 54));
        treeSet.add(new Student("Yunus", 12));
        treeSet.add(new Student("Berfin", 23));
        treeSet.add(new Student("Oguz", 18));

        for(Student s:treeSet){
            System.out.println(s.getName());
        }
        System.out.println("##############################################");
        //Alfabetik olarak sıralama String olarak
        TreeSet<Student> treeSet1 = new TreeSet<>(new OrderNameComprator());
        treeSet1.add(new Student("Buse", 22));
        treeSet1.add(new Student("Halil", 32));
        treeSet1.add(new Student("Meryem", 54));
        treeSet1.add(new Student("Yunus", 12));
        treeSet1.add(new Student("Berfin", 23));
        treeSet1.add(new Student("Oguz", 18));

        for(Student s:treeSet1){
            System.out.println(s.getName());
        }


    }
}
