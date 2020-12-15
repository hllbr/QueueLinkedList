
import java.util.LinkedList;
import java.util.Queue;

/*
LinkedList sınıfı hem List interface hemde Queue sınıfını implemente eden bir classtır.
Bu referansı Queue Classına atarsak queue gibi davranıyor.
Queue-->Türkçe anlamı kutruktur.
Stackler LIFO -->>last in Fist out olarak bilenen son giren ilk çıkar prensibi ile çalışıyordu.
Queue ise FIFO-->>First in First out prensibi var yani ilk giren ilk çıkar prensibi var.
Ramazan Pidesi yada Araba veya motorbisiklet gibi araçların Servislerdeki bakım Mantığı diyebiliriz.
LinkedListlerde add metodu vardı(List interface içerirken) queue interfaceinde de bu metod mevcuttur LinkedList için ...
yapının queue interfacei kullanarak oluşturulduğunu belli etmek amacıyla offer metodunu kullanıyoruz.
* Queue(Kuyruk) Interface'ini implemente eden LinkedList Classı FIFO(First In, First Out Mantığıyla Çalışır.) 
* add(Eleman) ----> Elemanı Kuyruğa Ekler. Ekleyemezse Hata Fırlatır.
* offer(Eleman) ----> Elemanı Kuyruğa Ekler. Eklerse True Döner, Ekleyemezse False Döner.
* remove() ----> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa hata fırlatır.
* poll() ------> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa null referans döner.
* element() ----> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa ,  hata fırlatır.
* peek() ------> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa , null referans döner.
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());
        queue.offer("JAVA");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
        
        System.out.println(queue.peek());
        
        for(String s :queue ){
            System.out.println(s);
        }
        while(true){
        System.out.println("*************************************************");
        System.out.println("Eleman Çıkarlıyor....");
            System.out.println("Sistenden Çıkarlılan elemanımız = \n"
                    + "///////////////////////////////////////////\n"
                    + queue.peek());
        Thread.sleep(3000);
        queue.poll();//Kuyruktaki ilk elemanı çıkarıyor.Eğer Kuyruk Boşsa bize null bir eleman döndürüyor.
        for(String s : queue){
            System.out.println(s);
        }
        if(queue.isEmpty()){
            System.out.println("Çıkarılacak Eleman Kalmadığı için Sistem Sonlandırlıyor Lütfen bekleyiniz");
            System.out.println("Sistemden Çıkış için 5 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 4 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 3 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 2 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 1 sn kaldı");
            Thread.sleep(1000);
            System.out.println("Sistemden Çıkış için 0 sn kaldı");
            System.out.println("Sistemden çıkış işlemi başarılı....");
            
            break;
        }
        }
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
