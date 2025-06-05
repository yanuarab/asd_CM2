import java.util.Scanner;

public class SPBUmain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKendaraan04 antrian = new AntrianKendaraan04();
        AntrianTransaksi04 riwayat = new AntrianTransaksi04();
        int pilihan;

        do {
            System.out.println("\n--- MENU SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Jumlah Antrian");
            System.out.println("4. Layani Kendaraan & Catat Transaksi");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Tipe Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Merek Kendaraan: ");
                    String merek = sc.nextLine();

                    Kendaraan04 k = new Kendaraan04(plat, tipe, merek);
                    antrian.enqueue(k);
                    System.out.println(">>> Kendaraan Masuk Antrian <<<");
                    break;

                case 2:
                    if (antrian.ukuran() == 0) {
                        System.out.println(">> Antrian Kosong <<");
                    } else {
                        antrian.tampilkan();
                    }
                    break;

                case 3:
                    System.out.println(">> Ada " + antrian.ukuran() + " Antrian Kendaraan <<");
                    break;

                case 4:
                    if (antrian.ukuran() == 0) {
                        System.out.println(">> Antrian Kosong <<");
                        break;
                    }

                    Kendaraan04 dilayani = antrian.layani();
                    System.out.println(">> Melayani <<");
                    dilayani.tampilkanInformasi();

                    System.out.print("Jenis BBM: ");
                    String jenis = sc.nextLine();
                    System.out.print("Harga per liter: ");
                    double harga = sc.nextDouble();
                    System.out.print("Jumlah liter: ");
                    double liter = sc.nextDouble();
                    sc.nextLine(); // konsumsi newline

                    BBM04 bbm = new BBM04(jenis, harga);
                    TransaksiPengisian04 pengisian = new TransaksiPengisian04(dilayani, bbm, liter);
                    riwayat.enqueue(pengisian);
                    System.out.println(">> Transaksi Tercatat <<");
                    break;

                case 5:
                    riwayat.tampilkan();
                    break;

                case 0:
                    System.out.println(">> Terima Kasih <<");
                    break;

                default:
                    System.out.println(">> Pilihan Tidak Valid <<");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
