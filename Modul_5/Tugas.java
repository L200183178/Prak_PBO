public class Tugas {
    String nama;
    String tglahir;

    public Tugas() {
        nama = "Eza Ammar";
        tglahir = "30 Mei 2000";
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglahir);
        System.out.println();
    }

    public Tugas(String nama, String tglahir) {
        this.nama = nama;
        this.tglahir = tglahir;
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglahir);
        System.out.println();
    }
}