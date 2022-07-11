import java.io.*;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Mehmet", "Turan", 4000);
        //File Tanımlandı
        File file = new File("Employe.txt");

        //File bulunamadığı durum için exeption alabilmek için try catch yapısı kuruldu
        try {
            //Dosya oluşturuldu
            file.createNewFile();
            //File Output Olarak verildi
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //objectOutputStream Nesnesi Oluşturuldu fileOutputStrea Objesi girildi
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //Dosyaya employee nesnesi serialization islemi yapıldi
            objectOutputStream.writeObject(employee);

            //File Input verildi
            FileInputStream fileInputStream = new FileInputStream(file);
            //fileInputStrem nesnesi girildi
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //Employee1 objesi oluşturuldu casting islemi yapıldi okunan veriler objeye atandi
            Employee employee1 = (Employee) objectInputStream.readObject();
            //Girdileri Okuma islemi yapıldi
            System.out.println(" ID : " + employee1.getId() + " Name : " + employee1.getName() + " SurName : " + employee.getSurName() + " Maas : " + employee.getSalary());

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
