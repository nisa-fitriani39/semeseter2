
import java.util.Scanner;
public class Dosen_14 {
    private String nidn;
    private String nama;
    private int tahunMasuk;
    private String jenjangPendidikan;
    private String prodi;

    public Dosen_14(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    public void tampilkanInfo() {
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Jenjang Pendidikan: " + jenjangPendidikan);
        System.out.println("Program Studi: " + prodi);
    }

    public void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
        System.out.println("Program Studi berhasil diubah ke: " + prodiBaru);
    }

    public void ubahPendidikan(String pendidikanBaru) {
        this.jenjangPendidikan = pendidikanBaru;
        System.out.println("Jenjang Pendidikan berhasil diubah ke: " + pendidikanBaru);
    }

    public String getNama() {
        return nama;
    }
}
