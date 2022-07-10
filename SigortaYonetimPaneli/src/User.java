import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private String surName;
    private static String email;
    private static String password;
    private String job;
    private int age;
    private String lastDate;
    public static ArrayList<Adress> adressLists = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    public User() {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.lastDate = lastDate;
    }

    public void customerInfo() {
        System.out.print("Adinizi Girin : ");
        this.setName(input.next());
        System.out.print("SoyAdinizi Girin : ");
        this.setSurName(input.next());
        System.out.print("Mail Adrsinizi Girin : ");
        this.setEmail(input.next());
        System.out.print("Sifrenizi Girin : ");
        this.setPassword(input.next());
        System.out.print("Mesleginizi Girin : ");
        this.setJob(input.next());
        System.out.println("Yasinizi Girin : ");
        this.setAge(input.nextInt());
        System.out.print("Tarih Girin : ");
        this.setLastDate(input.next());



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }
}
