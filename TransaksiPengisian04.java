public class TransaksiPengisian04 {
    Kendaraan04 kendaraan;
    BBM04 bbm;
    double liter, totalBayar;

    public TransaksiPengisian04(Kendaraan04 kendaraan, BBM04 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = liter * bbm.hargaPerLiter;
    }

    public void tampilkanTransaksi() {
        kendaraan.tampilkanInformasi(); 
        System.out.println("BBM: " + bbm.namaBBM);
        System.out.println("Liter: " + liter);
        System.out.println("Total bayar: Rp" + totalBayar);
    }
}
