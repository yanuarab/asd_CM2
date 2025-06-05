public class AntrianKendaraan04 {
    Node04 head, tail;
    int size;

    public void tambah(Kendaraan04 kendaraan) {
        Node04 baru = new Node04 (kendaraan);
         if (head == null) {
            head = tail = baru; 
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
    }

    public Kendaraan04 layani(){
        if (head == null) return null;
        Kendaraan04 kendaraan = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return kendaraan;
    }

    public void tampilkan() {
        if (head == null){
            System.out.println("Antrian kososng");
            return;
        }
        Node04 current = head;
        while (current == null) {
            current.data.tampilkanInformasi();
            current = current.next;
        } 
    }

    public int ukuran(){
        return size;
    }
}
