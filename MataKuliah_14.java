import java.util.ArrayList;

public class MataKuliah_14 {
    private String kodeMK;
    private String namaMK;
    private int sks;
    private ArrayList<Dosen_14> dosenPengampu;

    public MataKuliah_14(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = new ArrayList<>();
    }

    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Dosen Pengampu:");
        for (Dosen_01 dosen : dosenPengampu) {
            System.out.println("- " + dosen.getNama());
        }
    }

    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
        System.out.println("Nama Mata Kuliah berhasil diubah ke: " + namaMKBaru);
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
            System.out.println("SKS berhasil diubah ke: " + sksBaru);
        } else {
            System.out.println("SKS harus minimal 2!");
        }
    }

    public void tambahDosen(Dosen_14 dosen) {
        dosenPengampu.add(dosen);
        System.out.println("Dosen " + dosen.getNama() + " berhasil ditambahkan.");
    }
}
