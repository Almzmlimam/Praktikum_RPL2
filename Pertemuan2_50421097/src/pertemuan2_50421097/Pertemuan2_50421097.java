package pertemuan2_50421097;

/**
 *
 * @author Al Muzammil Imam
 */
public class Pertemuan2_50421097 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Almzmlimam", "50421097", 21);
        mahasiswa.tampilkanData();
        System.out.println();

        MahasiswaSarjana mahasiswaSarjana = new MahasiswaSarjana("Al Muzammil Imam", "50421097", 21, "Informatika");
        mahasiswaSarjana.tampilkanData();
        System.out.println();
    }

}
