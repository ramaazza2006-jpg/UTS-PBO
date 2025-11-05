
class Pegawai {
    String nama;
    double gaji;

    Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    void tampilInfo() {
        System.out.println("Nama Pegawai : " + nama);
        System.out.println("Gaji Pokok   : Rp" + gaji);
    }
}

class Manajer extends Pegawai {
    double tunjangan;

    Manajer(String nama, double gaji, double tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    void tampilManajer() {
        tampilInfo();
        System.out.println("Tunjangan    : Rp" + tunjangan);
    }
}

class Direktur extends Manajer {
    double bonusTahunan;

    Direktur(String nama, double gaji, double tunjangan, double bonusTahunan) {
        super(nama, gaji, tunjangan);
        this.bonusTahunan = bonusTahunan;
    }

    void tampilDirektur() {
        tampilManajer();
        System.out.println("Bonus Tahunan: Rp" + bonusTahunan);
        System.out.println("---------------------------");
        System.out.println("Total Pendapatan: Rp" + (gaji + tunjangan + bonusTahunan));
    }
}

public class MainPegawai {
    public static void main(String[] args) {
        Direktur d = new Direktur("Rama", 7000000, 3000000, 5000000);
        d.tampilDirektur();
    }
}
