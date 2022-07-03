import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Berna", 27));
        students.add(new Student("Ayse", 18));
        students.add(new Student("Koray", 50));
        students.add(new Student("Atakan", 22));
        students.add(new Student("Turgut", 49)); //Bir verinin aynısından bir daha girilirse ilk verinin üstune yazar
        students.add(new Student("Turgut", 49)); //Sıralama yoktut "H" fonsiyonundan çıkan değere göre sıralanır veriler

        for (Student s : students) {
            System.out.println("Isim : " + s.getName() + ", Yas : " + s.getAge());
        }

    }
}
