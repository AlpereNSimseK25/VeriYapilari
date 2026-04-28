import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args){
        LinkedList bagli_liste = new LinkedList();
        Queue kuyruk = new LinkedList();
        bagli_liste.add(10);
        bagli_liste.add(20);
        bagli_liste.addFirst(0);
        bagli_liste.addLast(30);

        while(!bagli_liste.isEmpty()){
            System.out.println(bagli_liste.remove()); // burada bagli_liste den çıkardığı değerleri yazdırıyor
        }

        System.out.println("--------------------------------------------------");

        kuyruk.add(10);
        kuyruk.add(20);

        while(!kuyruk.isEmpty()){
            System.out.println(kuyruk.remove());
        }
    }

}
