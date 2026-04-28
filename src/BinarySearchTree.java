public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
        static Node Agac_min_ara(Node kok) {
            while (kok.left != null) {
                kok = kok.left;
            }
            return kok;
        }

        static Node Agac_max_ara(Node kok){
            while(kok.right != null){
                kok = kok.right;
            }
            return kok;
        }

        static Node Agac_arama(Node kok, int aranan){
            while (kok != null) {

                // 1. Durum: Aranan sayı, o anki düğüme eşitse BULDUK
                if (aranan == kok.data) {
                    return kok;
                }
                // 2. Durum: Aranan sayı küçükse SOLA git
                else if (aranan < kok.data) {
                    kok = kok.left;
                }
                // 3. Durum: Aranan sayı büyükse SAĞA git
                else {
                    kok = kok.right;
                }
            }
            return null;
        }
    }
    public static void main(String[] args){
        Node kok = new Node(10);
        kok.left = new Node(5);
        kok.left.left = new Node(2);
        kok.right = new Node(20);
        kok.right.right = new Node(29);
        kok.right.left = new Node(18);


        System.out.println("Min eleman: "+ Node.Agac_min_ara(kok).data);
        System.out.println("Max eleman: "+ Node.Agac_max_ara(kok).data);


        int aranan = 20;
        Node sonuc = Node.Agac_arama(kok, aranan);

        // Sonucu ekrana yazdırırken Null kontrolü yapmalıyız
        if (sonuc != null) {
            System.out.println("Bulunan Düğümün Değeri: " + sonuc.data);
        } else {
            System.out.println("Sayı ağaçta bulunamadı.");
        }
    }
}
