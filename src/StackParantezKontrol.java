import java.util.Stack;

public class StackParantezKontrol {

    // Kontrol işlemini yapan metod
    public static boolean parantezKontrol(String ifade) {
        // 1. Karakterleri tutmak için bir Stack oluşturuyoruz
        Stack<Character> stack = new Stack<>();

        // 2. İfadeyi karakter karakter geziyoruz
        for (int i = 0; i < ifade.length(); i++) {
            char karakter = ifade.charAt(i);

            // DURUM A: Açma parantezi ise
            if (karakter == '(') {
                // İpucunda dendiği gibi stack'e ekliyoruz
                stack.push(karakter);
            }
            // DURUM B: Kapama parantezi ise
            else if (karakter == ')') {
                // Önce kontrol et: Stack boş mu?
                if (stack.isEmpty()) {
                    // Hata: Henüz açılmış bir parantez yokken kapatma geldi.
                    // Örnek: "a + b )"
                    return false;
                }
                // Eşleşme var, en son eklenen açma parantezini yığından atıyoruz
                stack.pop();
            }
            // Not: Harfler, sayılar veya işlem işaretleri ile ilgilenmiyoruz.
        }

        // 3. Döngü bittiğinde Stack boş mu dolu mu?
        // Boşsa (true) hepsi eşleşmiştir. Doluysa (false) kapatılmamış parantez kalmıştır.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Sorudaki Hatalı Örnek
        String hataliOrnek = "(a+b)-(c-3/(a+x)";

        // Doğru Bir Örnek
        String dogruOrnek = "(a+b)-(c-3/(a+x))";

        System.out.println("Kontrol 1 (" + hataliOrnek + "): " +
                (parantezKontrol(hataliOrnek) ? "DOĞRU" : "YANLIŞ"));

        System.out.println("Kontrol 2 (" + dogruOrnek + "): " +
                (parantezKontrol(dogruOrnek) ? "DOĞRU" : "YANLIŞ"));
    }
}
