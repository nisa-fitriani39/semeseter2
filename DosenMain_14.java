import java.util.Scanner;
public class DosenMain_14 {
    public static void main(String[] args) {
        Dosen_14 dosen1 = new Dosen_14("123456", "Dr. Rina", 2010, "S3", "Teknik Informatika");
        Dosen_14 dosen2 = new Dosen_14("654321", "Dr. Budi", 2012, "S2", "Sistem Informasi");

        dosen1.tampilkanInfo();
        System.out.println();
        dosen2.tampilkanInfo();

        dosen1.ubahProdi("Rekayasa Perangkat Lunak");
        dosen2.ubahPendidikan("S3");

        System.out.println();
        dosen1.tampilkanInfo();
        System.out.println();
        dosen2.tampilkanInfo();
    }
}
