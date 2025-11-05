class AlatMusik {
    String nama;

    AlatMusik(String nama) {
        this.nama = nama;
    }

    void bunyikan() {
        System.out.println("Alat musik ini berbunyi dengan cara umum.");
    }
}

class Gitar extends AlatMusik {

    Gitar(String nama) {
        super(nama);
    }

    void bunyikan() {
        System.out.println(nama + " dimainkan dengan cara dipetik.");
    }

    void tuneGitar() {
        System.out.println("Menyetem senar gitar sebelum dimainkan.");
    }
}

public class MainAlatMusik {
    public static void main(String[] args) {
        AlatMusik alat = new AlatMusik("Umum");
        Gitar gitar = new Gitar("Gitar Akustik");

        alat.bunyikan();
        gitar.bunyikan();
        gitar.tuneGitar();
    }
}
