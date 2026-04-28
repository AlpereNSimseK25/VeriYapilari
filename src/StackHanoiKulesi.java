import java.util.Stack;

public class StackHanoiKulesi {

    // Kulelerimizi (İğneleri) Stack olarak tanımlıyoruz
    static Stack<Integer> kaynak = new Stack<>();
    static Stack<Integer> yardimci = new Stack<>();
    static Stack<Integer> hedef = new Stack<>();

    public static void main(String[] args) {
        int diskSayisi = 3; // Örnek olarak 3 disk

        // 1. Kaynak kuleyi doldur (Büyükten küçüğe: 3, 2, 1)
        // 3 en altta, 1 en üstte olacak şekilde push ediyoruz.
        for (int i = diskSayisi; i > 0; i--) {
            kaynak.push(i);
        }

        System.out.println("Başlangıç Durumu:");
        yiginlariYazdir();

        // 2. Çözümü Başlat
        hanoiCoz(diskSayisi, kaynak, hedef, yardimci, "A", "C", "B");
    }

    // Recursive (Özyinelemeli) Çözüm Fonksiyonu
    public static void hanoiCoz(int n, Stack<Integer> k, Stack<Integer> h, Stack<Integer> y, String kAd, String hAd, String yAd) {
        // Temel Durum: Eğer taşınacak disk kalmadıysa dur.
        if (n == 0) {
            return;
        }

        // ADIM 1: n-1 diski Kaynak'tan Yardımcı'ya taşı (Hedef'i geçici olarak kullan)
        hanoiCoz(n - 1, k, y, h, kAd, yAd, hAd);

        // ADIM 2: En alttaki diski (n. disk) Kaynak'tan Hedef'e taşı
        int tasinanDisk = k.pop(); // Diski çıkar
        h.push(tasinanDisk);       // Diğer çubuğa tak

        System.out.println("Disk " + tasinanDisk + " taşındı: " + kAd + " -> " + hAd);
        yiginlariYazdir(); // Her hamleden sonra durumu göster

        // ADIM 3: Yardımcı'daki n-1 diski Hedef'e taşı (Kaynak'ı geçici olarak kullan)
        hanoiCoz(n - 1, y, h, k, yAd, hAd, kAd);
    }

    // Kulelerin o anki durumunu görmek için yardımcı metot
    public static void yiginlariYazdir() {
        System.out.println("  A (Kaynak)  : " + kaynak);
        System.out.println("  B (Yardımcı): " + yardimci);
        System.out.println("  C (Hedef)   : " + hedef);
        System.out.println("-------------------------");
    }

}
