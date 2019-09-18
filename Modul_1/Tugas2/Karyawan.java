
/**
 *
 * @author Eza
 */
public class Karyawan {
    String nama;
    double gaji;
    String jabatan;
    String alamat;

    void nama(String namaKaryawan){
        nama = namaKaryawan;
    }
    void gaji(int gajiKaryawan){
        gaji = gajiKaryawan;
    }
    void jabatan(String JabatanKaryawan){
        jabatan = JabatanKaryawan;
    }
    void Adres(String alamatRumah){
        alamat = alamatRumah;
    }
    void Print(){
        System.out.println(
                "Nama :"+nama+"\n"+
                "Gaji :"+gaji+"\n"+
                "Jabatan :"+jabatan+"\n"+
                "Alamat :"+alamat+"\n"
        );
    }
    
    
    public static void main(String[] args) {

        Karyawan karyawan = new Karyawan();
        
        karyawan.nama("Mr.Administrasi Lobby");
        karyawan.gaji(7000000);
        karyawan.jabatan("Jaga Komputer Lobby");
        karyawan.Adres("Kota Solo");
        karyawan.Print();
        
    
    }
    
}
