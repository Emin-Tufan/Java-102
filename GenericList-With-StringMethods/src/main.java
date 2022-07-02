public class main {
    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.addData(10);
        liste.addData(20);
        liste.addData(30);
        liste.addData(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.addData(50);
        liste.addData(60);
        liste.addData(70);
        liste.addData(80);
        liste.addData(90);
        liste.addData(100);
        liste.addData(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        MyList<Integer> liste2 = new MyList<>();
        liste2.addData(10);
        liste2.addData(20);
        liste2.addData(30);
        System.out.println("2. indisteki değer : " + liste2.getIndex(2));
        liste2.remove(2);
        liste2.addData(40);
        liste2.setIndex(0, 100);
        System.out.println("2. indisteki değer : " + liste2.getIndex(2));
        System.out.println(liste2.tooString());

        MyList<Integer> liste3 = new MyList<>();
        System.out.println("Liste Durumu : " + (liste3.isEmpty() ? "Dolu" : "Boş"));
        liste3.addData(10);
        liste3.addData(20);
        liste3.addData(30);
        liste3.addData(40);
        liste3.addData(20);
        liste3.addData(50);
        liste3.addData(60);
        liste3.addData(70);

        System.out.println("Liste Durumu : " + (liste3.isEmpty() ? "Dolu" : "Boş"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste3.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste3.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste3.lasIndexOff(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste3.toNewArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = liste3.sublist(0, 3);
        System.out.println(altListem.tooString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste3.contains(20));
        System.out.println("Listemde 120 değeri : " + liste3.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste3.clear();
        System.out.println(liste3.tooString());


    }
}
