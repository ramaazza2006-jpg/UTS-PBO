class AkunBank {
    private double saldo;       
    protected String pemilik;   
    public String bank;          

    AkunBank(String pemilik, String bank, double saldoAwal) {
        this.pemilik = pemilik;
        this.bank = bank;
        this.saldo = saldoAwal;
    }

    private void infoSaldoRahasia() {
        System.out.println("Saldo rahasia: Rp" + saldo);
    }

    protected void tampilInfo() {
        System.out.println("Pemilik Akun: " + pemilik);
        System.out.println("Bank        : " + bank);
        infoSaldoRahasia(); // hanya bisa dipanggil di class ini
    }

    public void tambahSaldo(double nominal) {
        saldo += nominal;
    }

    public double getSaldo() {
        return saldo;
    }
}

class RekeningTabungan extends AkunBank {
    double bunga;

    RekeningTabungan(String pemilik, String bank, double saldoAwal, double bunga) {
        super(pemilik, bank, saldoAwal);
        this.bunga = bunga;
    }

    void tampilRincian() {
        // pemilik dan bank bisa diakses karena protected/public
        System.out.println("Rekening Tabungan milik " + pemilik + " di " + bank);
        System.out.println("Bunga tahunan: " + bunga + "%");
        System.out.println("Saldo saat ini: Rp" + getSaldo());
        // saldo tidak bisa langsung diakses (karena private di superclass)
    }
}

public class MainAkunBank {
    public static void main(String[] args) {
        RekeningTabungan r = new RekeningTabungan("Marco", "Bank Mandiri", 1000000, 5);
        r.tambahSaldo(500000);
        r.tampilRincian();
    }
}
