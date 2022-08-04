import java.util.ArrayList;
import java.util.List;

public class ThreadRace implements Runnable{
    List<Integer>odd=new ArrayList<>();
    List<Integer>even=new ArrayList<>();

    @Override
    public void run() {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=100;i++){
            list.add(i);
        }
        List<Integer>list1=new ArrayList<>();
        list1=list.subList(0,25);
        List<Integer>list2=new ArrayList<>();
        list2=list.subList(25,50);
        List<Integer>list3=new ArrayList<>();
        list3=list.subList(50,75);
        List<Integer>list4=new ArrayList<>();
        list4=list.subList(75,101);

        oddEven(list1);
        oddEven(list2);
        oddEven(list3);
        oddEven(list4);

        System.out.println("Tek Sayilar");
        System.out.println(odd);
        System.out.println();
        System.out.println("Cift Sayilar");
        System.out.println(even);

    }
    public void oddEven(List<Integer>list){
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0)
                even.add(list.get(i));
            else
                odd.add(list.get(i));
        }
    }
}
