public class AntrianTransaksi04 { //queue
    TransaksiPengisian04[] data;
    int front, rear, size, kapasitas;

    public AntrianTransaksi04() {
        this.kapasitas = 100;
        data = new TransaksiPengisian04[kapasitas];
        front = rear = size = 0;
    }

    public void enqueue(TransaksiPengisian04 transaksi) {
        if (size == kapasitas) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        data[rear] = transaksi;
        rear = (rear + 1) % kapasitas;
        size++;
    }

    public void tampilkan() {
        if (size == 0) {
            System.out.println("Belum ada transaksi!");
            return;
        }

        int i = front;
        for (int j = 0; j < size; j++) {
            System.out.println("=========");
            data[i].tampilkanTransaksi();
            i = (i + 1) % kapasitas;
        }
    }
}
