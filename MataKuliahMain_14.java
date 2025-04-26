import java.util.Scanner;
public class MataKuliahMain_14 {
    public static void main(String[] args) {
        Dosen_14 dosen1 = new Dosen_14("123456", "Dr. Rina", 2010, "S3", "Teknik Informatika");
        Dosen_14 dosen2 = new Dosen_14("654321", "Dr. Budi", 2012, "S3", "Sistem Informasi");

        MataKuliah_14 mk = new MataKuliah_14("IF101", "Algoritma dan Struktur Data", 3);
        mk.tambahDosen(dosen1);
        mk.tambahDosen(dosen2);

        mk.tampilkanInfo();

        System.out.println();
        mk.ubahNamaMK("Struktur Data Lanjut");
        mk.ubahSKS(4);

        System.out.println();
        mk.tampilkanInfo();
    }
}
