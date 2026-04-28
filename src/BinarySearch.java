public class BinarySearch {
    static int ikiliArama(int dizi[], int aranan){
        int sol = 0;
        int sag = dizi.length-1;
        while(sol<=sag){
            int orta =(sol+sag)/2;
            if(dizi[orta]==aranan){
                return orta;
            }
            else if(aranan<dizi[orta]){
                sag = orta-1;
            }
            else{
                sol = orta+1 ;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int dizi[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aranan = 2;
        int indis = ikiliArama(dizi, aranan);
        System.out.println("Aranan sayının indisi: "+indis);
        System.out.println("Aranan sayı: "+dizi[indis]);
    }
}
