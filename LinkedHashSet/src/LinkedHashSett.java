import java.util.LinkedHashSet;

public class LinkedHashSett {
    public static void main(String[] args) {

        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student("Berna", 38));
        students.add(new Student("Ahmet", 12));
        students.add(new Student("Koray", 25));
        students.add(new Student("Ali", 22));
        students.add(new Student("Ayse", 15));
        students.add(new Student("Kazim", 43));

        //Haslerden farklı olarak Veriler nasıl girildiyse o sekilde çıkıyor FİFO

        for(Student s:students){
            System.out.println("Isim : "+s.getName()+ ", Yas : "+s.getAge());
        }

    }
}
