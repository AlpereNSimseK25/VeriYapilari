import java.math.BigInteger;
import java.util.Stack;

public class StackFibonacci {
    public static void main(String[] args) {

        Stack<BigInteger> fibStack = new Stack<>();

        // 2. Serinin ilk iki elemanını (0 ve 1) yığına ekliyoruz
        fibStack.push(BigInteger.ZERO); // 0
        fibStack.push(BigInteger.ONE);  // 1

        System.out.println("Fibonacci Serisi (İlk 100 Eleman):");

        // İlk iki elemanı manuel yazdırıyoruz
        System.out.println("1. " + BigInteger.ZERO);
        System.out.println("2. " + BigInteger.ONE);

        // 3. 3. elemandan 100. elemana kadar döngü kuruyoruz
        for (int i = 3; i <= 100; i++) {

            // ADIM A: En üstteki elemanı geçici olarak çıkar (Diyagramdaki temp1)
            // Stack: [0, 1] -> pop() -> Stack: [0], temp1 = 1
            BigInteger temp1 = fibStack.pop();

            // ADIM B: Altındaki elemana bak ama çıkarma (Diyagramdaki temp2)
            // Stack: [0] -> peek() -> temp2 = 0
            BigInteger temp2 = fibStack.peek();

            // ADIM C: Yeni değeri hesapla (Kırmızı ok)
            BigInteger yeniDeger = temp1.add(temp2); // biginteger olduğu için toplama işlemi .add ile yapılıyor

            // ADIM D: Çıkardığımız temp1'i geri koy (Stack eski haline dönsün)
            fibStack.push(temp1);

            // ADIM E: Yeni hesaplanan değeri yığına ekle
            fibStack.push(yeniDeger);

            // Ekrana yazdır
            System.out.println(i + ". " + yeniDeger);
        }
    }


}
