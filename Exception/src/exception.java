import java.util.Scanner;

public class exception {
    public  static void ayikla(int a) throws Exception{

        if(a<18){
            throw new Exception("Yasiniz tutmuyor Alani terk edin lutfen!");
        }
        System.out.println("İceri girebilirsiniz !");
    }
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);

        int age;
        System.out.println("Lutfen yasinizi girin : ");
        age=input.nextInt();

        try {
            System.out.println("Method iceri girdi ! ");
            ayikla(age);
            System.out.println("Devam ediyormu kontrol ");
        }
        catch (Exception e){
            System.out.println("Hata bulundu !");
            e.toString();
        }
    }
}
